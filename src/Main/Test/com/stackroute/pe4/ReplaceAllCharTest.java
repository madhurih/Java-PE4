package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceAllCharTest
{
    public static ReplaceAllChar rc;

    @BeforeClass
    public static void setup()
    {
        //arrange
        rc = new ReplaceAllChar();
    }

    @AfterClass
    public static void teardown()
    {
        //arrange
        rc = null;
    }

    @Test
    public void replaceCharTest_ExistingStringGiven_ShouldReturnString()
    {
        //arrange
        String str = "daily dry";
        //act and assert
        assertEquals("faity fry", rc.replaceChar(str));
    }
}
