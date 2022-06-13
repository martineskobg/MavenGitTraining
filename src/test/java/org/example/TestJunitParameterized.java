package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class TestJunitParameterized {

    // Create a test to pass numbers parameters
    @DisplayName("Should sum two Integer numbers")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, expected={2}")
    @MethodSource("org.example.DataProviders#integerProvider")
    void checkTheSum(int num1, int num2, int expected) {
        Assertions.assertEquals(expected, num1 + num2);
    }

    @DisplayName("Should sum two Double numbers")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, expected={2}")
    @MethodSource("org.example.DataProviders#doubleProvider")
    void checkTheSum(double num1, double num2, double expected) {
        Assertions.assertEquals(expected, num1 + num2);
    }

    @DisplayName("Should sum two Float numbers")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, expected={2}")
    @MethodSource("org.example.DataProviders#floatProvider")
    void checkTheSum(float num1, float num2, float expected) {
        Assertions.assertEquals(expected, num1 + num2);
    }

    @DisplayName("Should sum two Long numbers")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, expected={2}")
    @MethodSource("org.example.DataProviders#longProvider")
    void checkTheSum(long num1, long num2, long expected) {
        assertEquals(expected, num1 + num2);
    }


    // Create a test to pass String parameters
    @DisplayName("Assert full name")
    @ParameterizedTest
    @MethodSource("org.example.DataProviders#namesProvider")
    void checkNames(String firsName, String lastName, String fullName) {
        assertEquals(fullName, firsName.concat(" ").concat(lastName));
    }

    // Create a test to read from CSV structure in the method and
    // another test to read data from CSV file.

    @DisplayName("Assert Strings")
    @ParameterizedTest
    @CsvSource(value = {"Martin-MARTIN", "bAchev-BACHEV", "Jav3A-JAVA"}, delimiter = '-')
    void toUpperCase_ShouldGenerateTheExpectedUppercaseValue(String input, String expected) {
        String actualValue = input.toUpperCase();
        assertEquals(expected, actualValue);
    }


    @DisplayName("Read data from CSV file")
    @ParameterizedTest
    @CsvFileSource(resources = "/csvInfo.csv", numLinesToSkip = 1)
    void createPersonFromCSV(String name, String phone, String email) throws FileNotFoundException {
        String personName = name;
        String personPhone = phone;
        String personEmail = email;
        Person person = new Person(personName, personPhone, personEmail);
        System.out.println(person.toString());
        assertTrue(person instanceof Person);
    }
}
