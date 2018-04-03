package local.home.jackson5.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleTest {
    @Test
    public void myFirstTestMethod() {

        assertTrue(true);
        assertEquals(1, 1);
        Assert.assertNotEquals(1, 2);

        assertFalse(false);
    }

    interface MyInterface {
        String HELLO_MESSAGE = "Hello message";

        default String getHello() {
            return HELLO_MESSAGE;
        }

    }


    public static class MyDataClass implements MyInterface {

    }

    @Test
    public void testMyData() {
        MyDataClass myDataClass = new MyDataClass();
        assertEquals(MyInterface.HELLO_MESSAGE, myDataClass.getHello());
    }

}
