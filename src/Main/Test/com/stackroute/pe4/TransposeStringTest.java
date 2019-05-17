package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransposeStringTest
{
    public static TransposeString ts;

    @BeforeClass
    public static void setup()
    {
        //arrange
        ts = new TransposeString();

    }

    @AfterClass
    public static void teardown()
    {
        //arrange
        ts = null;

    }

    @Test
    public void transposeOfString_ExistingStringGiven_ShouldReturnTransposeString()
    {
        //arrange
        String str = "i need my space...!";
        //act and assert
        assertEquals("i deen ym !...ecaps ", ts.transposeOfString(str));
    }

}
