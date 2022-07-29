package life.genny.datagenerator.utils;

import life.genny.datagenerator.model.AttributeCode;
import life.genny.datagenerator.model.BaseEntityAttributeModel;
import life.genny.datagenerator.model.BaseEntityModel;
import life.genny.datagenerator.model.json.Place;
import life.genny.datagenerator.service.BaseEntityService;
import life.genny.datagenerator.service.PlaceService;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddressGenerator extends Generator {

    private static final Logger LOGGER = Logger.getLogger(UserGenerator.class.getSimpleName());

    public AddressGenerator(int count, BaseEntityService service, long id) {
        super(count, service, id);
    }

    @Inject
    PlaceService placeService;

    List<Place> places = new ArrayList<>();

    public BaseEntityModel createAddressEntity() {
        BaseEntityModel model = new BaseEntityModel();
        model.setName(GeneratorUtils.generateFirstName() + " " + GeneratorUtils.generateLastName());
        model.setCode(AttributeCode.DEF_ADDRESS.class);
        model.setStatus(1);
        return model;
    }

    public BaseEntityAttributeModel createBaseEntityAttributeModel(AttributeCode.DEF_ADDRESS attributeCode, Object value) {
        BaseEntityAttributeModel entity = new BaseEntityAttributeModel();
        entity.setAttributeCode(attributeCode);
        entity.setInferred(GeneratorUtils.DEFAULT_INFERRED);
        entity.setPrivacyFlag(GeneratorUtils.DEFAULT_PRIVACY_FLAG);
        entity.setReadOnly(GeneratorUtils.DEFAULT_READ_ONLY);
        entity.setRealm(GeneratorUtils.DEFAULT_REALM);
        try {
            entity.setValue(value);
        } catch (Exception e) {
            LOGGER.error(e);
        }
        return entity;
    }

    public List<BaseEntityModel> generateAddressBulk(long count) {
        List<BaseEntityModel> models = new ArrayList<>();
        int i = 0;
        while (i < count) {
            BaseEntityModel model = createAddressEntity();

            Map<String, String> address = GeneratorUtils.generateFullAddress();
            model.addAttribute(
                    createBaseEntityAttributeModel(AttributeCode.DEF_ADDRESS.ATT_PRI_ADDRESS_ADDRESS1, address.get("full"))
            );
            model.addAttribute(
                    createBaseEntityAttributeModel(AttributeCode.DEF_ADDRESS.ATT_PRI_ADDRESS_ADDRESS2, address.get("second"))
            );
            model.addAttribute(
                    createBaseEntityAttributeModel(AttributeCode.DEF_ADDRESS.ATT_PRI_ADDRESS_POSTCODE, address.get("zipCode"))
            );
            model.addAttribute(
                    createBaseEntityAttributeModel(AttributeCode.DEF_ADDRESS.ATT_PRI_ADDRESS_CITY, address.get("city"))
            );
            model.addAttribute(
                    createBaseEntityAttributeModel(AttributeCode.DEF_ADDRESS.ATT_PRI_ADDRESS_COUNTRY, address.get("country"))
            );
            model.addAttribute(
                    createBaseEntityAttributeModel(AttributeCode.DEF_ADDRESS.ATT_PRI_ADDRESS_POSTCODE, address.get("zipCode"))
            );
            model.addAttribute(
                    createBaseEntityAttributeModel(AttributeCode.DEF_ADDRESS.ATT_PRI_ADDRESS_STATE, address.get("province"))
            );
            models.add(model);
            i++;
        }
        return models;
    }

    @Override
    List<BaseEntityModel> onGenerate(int count) {
        return generateAddressBulk(count);
    }
}
