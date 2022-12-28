package life.genny.datagenerator.utils;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import life.genny.datagenerator.Constants;
import life.genny.qwandaq.utils.testsuite.BaseTestCase;
import life.genny.qwandaq.utils.testsuite.JUnitTester;

public class DataFakerCustomUtilsTest extends BaseTestCase {

    @Test
    void generateName() {
        new JUnitTester<String, Boolean>()
                .setTest((input) -> {
                    return Expected(!input.input.isEmpty());
                })
                .createTest("Generate Random Name Check")
                .setInput(DataFakerCustomUtils.generateName())
                .setExpected(true)
                .build()

                .assertAll();
    }

    @Test
    void generateEmailFromRegex() {
        new JUnitTester<String, String>()
                .setTest((input) -> {
                    return Expected(input.input);
                })

                .setVerification((result, expected) -> {
                    Pattern pattern = Pattern.compile(expected);
                    Matcher matcher = pattern.matcher(result);
                    assertTrue(matcher.matches());
                })
                .createTest("Generate Email From Regex Check 1")
                .setInput(DataFakerCustomUtils.generateEmailFromRegex(Constants.EMAIL_REGEX))
                .setExpected(Constants.EMAIL_REGEX)
                .build()

                .setTest((input) -> {
                    return Expected(input.input.split("@")[1]);
                })
                .createTest("Generate Email From Regex Check 2")
                .setInput(DataFakerCustomUtils.generateEmailFromRegex(Constants.EMAIL_REGEX, "gada.io"))
                .setExpected("gada.io")
                .build()

                .assertAll();
    }

    @Test
    void generateEmail() {
        String firstName = DataFakerCustomUtils.generateName();
        String lastName = DataFakerCustomUtils.generateName();
        String auDomain = "gmail.au";

        new JUnitTester<String, String>()
                .setTest((input) -> {
                    return Expected(input.input);
                })

                .setVerification((result, expected) -> {
                    Pattern pattern = Pattern.compile(expected);
                    Matcher matcher = pattern.matcher(result);
                    assertTrue(matcher.matches());
                })
                .createTest("Generate Email Check 1")
                .setInput(DataFakerCustomUtils.generateEmail(firstName, lastName))
                .setExpected("^(" + firstName + ")\\.(" + lastName + ")\\+" + RegexMode.WORD_CHARS
                        + "*\\@[A-Za-z]+(.[A-Za-z]+)+")
                .build()

                .setVerification((result, expected) -> {
                    Pattern pattern = Pattern.compile(expected);
                    Matcher matcher = pattern.matcher(result);
                    assertTrue(matcher.matches());
                })
                .createTest("Generate Email Check 2")
                .setInput(DataFakerCustomUtils.generateEmail(firstName, lastName, auDomain))
                .setExpected("^(" + firstName + ")\\.(" + lastName + ")\\+" + RegexMode.WORD_CHARS + "*\\@(" + auDomain
                        + ")+")
                .build()

                .assertAll();
    }

    @Test
    void generateInitials() {
        String fullName = "Thomas Alva Edison";
        new JUnitTester<String, String>()
                .setTest((input) -> {
                    return Expected(input.input);
                })

                .createTest("Generate Initials Check")
                .setInput(DataFakerCustomUtils.generateInitials(fullName.split(" ")))
                .setExpected("TAE")
                .build()

                .assertAll();
    }

    @Test
    void generateFile() {
        // TODO: Need to update the test validation for generating file
        new JUnitTester<FileInputStream, Boolean>()
                .setTest((input) -> {
                    try {
                        return Expected(input.input.readAllBytes() != null);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return Expected(false);
                })

                .createTest("Generate File Check 1")
                .setInput(DataFakerCustomUtils.generateFile())
                .setExpected(true)
                .build()

                .createTest("Generate File Check 2")
                .setInput(DataFakerCustomUtils.generateFile("sample-text"))
                .setExpected(true)
                .build()

                .assertAll();

    }

}
