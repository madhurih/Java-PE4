package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountOccurrencesTest
{
    public static CountOccurrences co;

    @BeforeClass
    public static void setup()
    {
        //arrange
        co = new CountOccurrences();
    }

    @AfterClass
    public static void teardown()
    {
        //arrange
        co = null;

    }

    @Test
    public void countCharTest_ExistingStringGiven_ShouldReturnIntegerCount()
    {
        //arrange
        String str = "i need my space...";
        assertEquals(3, co.countChar(str)); //act and assert
    }
}
