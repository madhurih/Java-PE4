package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ImplementRegularExpressionTest
{
    public static ImplementRegularExpression ire;

    @BeforeClass
    public static void setup()
    {
        //arrange
        ire = new ImplementRegularExpression();
    }

    @AfterClass
    public static void teardown()
    {
        //arrange
        ire = null;
    }

    @Test
    public void countCharTestTrue_ExistingStringGiven_ShouldReturnIntegerCount()
    {
        //arrange
        String str = "This is Harry";
        String name = "Harry";
        //act and assert
        assertEquals(true, ire.findPresence(str, name));
    }

    @Test
    public void countCharTestFalse_ExistingStringGiven_ShouldReturnIntegerCount()
    {
        //arrange
        String str = "This is Henry";
        String name = "Harry";
        //act and assert
        assertEquals(false, ire.findPresence(str, name));
    }
}
