package life.genny.datagenerator.generators;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import life.genny.datagenerator.SpecialAttributes;
import life.genny.datagenerator.utils.DataFakerCustomUtils;
import life.genny.datagenerator.utils.DataFakerUtils;
import life.genny.qwandaq.attribute.EntityAttribute;
import life.genny.qwandaq.entity.BaseEntity;
import life.genny.qwandaq.validation.Validation;

@ApplicationScoped
public class PersonGenerator extends CustomFakeDataGenerator {
    private static final String GENDER_REGEX = "(MALE|FEMALE|OTHER|PREFER NOT TO SAY)";
    private static final String PHONE_REGEX = "(^\\+[1-9]{1,3})([0-9]{9,11})$";

    @Override
    public BaseEntity generate(BaseEntity entity) {
        String firstName = DataFakerCustomUtils.generateName();
        String lastName = DataFakerCustomUtils.generateName();
        String gender = DataFakerUtils.randStringFromRegex(GENDER_REGEX);
        for (EntityAttribute ea : entity.getBaseEntityAttributes()) {
            List<Validation> validations = ea.getAttribute().getDataType().getValidationList();
            String className = ea.getAttribute().getDataType().getClassName();
            Object newObj = runGenerator(ea.getAttributeCode(),
                    validations.size() > 0 ? validations.get(0).getRegex() : null,
                    firstName, lastName, gender);

            if (newObj != null) {
                dataTypeInvalidArgument(ea.getAttributeCode(), newObj, className);
                ea.setValue(newObj);
            }
        }
        return entity;
    }

    @Override
    Object runGenerator(String attributeCode, String regex, String... args) {
        return switch (attributeCode) {
            case SpecialAttributes.PRI_EMAIL:
                regexNullPointer(attributeCode, regex);
                if (args.length > 0)
                    yield DataFakerCustomUtils.generateEmail(args[0], args[1], DataFakerCustomUtils.DEFAULT_DOMAIN);
                else
                    yield DataFakerCustomUtils.generateEmailFromRegex(regex, DataFakerCustomUtils.DEFAULT_DOMAIN);

            case SpecialAttributes.PRI_INITIALS:
                yield DataFakerCustomUtils.generateInitials(args);

            case SpecialAttributes.PRI_FIRSTNAME:
                yield args[0];

            case SpecialAttributes.PRI_LASTNAME:
                yield args[1];

            case SpecialAttributes.PRI_GENDER:
                yield args[2];

            case SpecialAttributes.LNK_GENDER_SELECT:
                yield "[\"" + args[2] + "\"]";

            case SpecialAttributes.PRI_PHONE:
                yield DataFakerUtils.randStringFromRegex(PHONE_REGEX);

            case SpecialAttributes.PRI_MOBILE:
            case SpecialAttributes.PRI_WHATSAPP:
            case SpecialAttributes.PRI_LANDLINE:
                String value = "";
                while (value.length() < 5)
                    value = DataFakerUtils.randStringFromRegex(regex);
                yield value;

            case SpecialAttributes.PRI_SUBMIT:
            default:
                yield null;
        };
    }
}