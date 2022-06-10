package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SayHelloTest extends TestCase {

    @Test
    public void testHelloWorld() {
        SayHello sayHello = new SayHello();

        String expectedResult  = "Hellooooooooo World";
        String actualResult = sayHello.sayHello();
        Assert.assertEquals(expectedResult, actualResult);
    }

}