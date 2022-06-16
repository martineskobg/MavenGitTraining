package org.example;

import org.junit.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.print.attribute.TextSyntax;
import java.time.Month;

import static org.junit.Assert.assertTrue;

public class TestSayHello {
    String message = "Hello World";
    SayHello sayHello = new SayHello(message);

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Before
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @After
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test
    public void testHelloWorld() {
        Assert.assertEquals(message, sayHello.printMessage());
    }

    @Test(expected = ArithmeticException.class)
    public void testPrntMessage() {
        System.out.println("Martin Is Printing");
        sayHello.prntMessage();
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    public void isOddTest(int number) {
        assertTrue(sayHello.isOdd(number));
    }

    @ParameterizedTest
    @EnumSource(Month.class)
    public void getValForMonth(Month month) {
        int id = month.getValue();
        System.out.println(month.name());
        assertTrue(id >= 1 && id <= 12);
    }

}