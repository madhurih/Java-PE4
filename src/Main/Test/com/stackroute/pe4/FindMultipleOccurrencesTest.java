package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindMultipleOccurrencesTest
{
        public static FindMultipleOccurrences fm;
        @BeforeClass
        public static void setup()
        {
            //arrange
            fm = new FindMultipleOccurrences();
        }

        @AfterClass
        public static void tearDown()
        {
            //arrange
            fm = null;
        }

        @Test
        public void multiOccur_ExistingStringGiven_ShouldReturnPositionCount()
        {
            //arrange
            String str = "where there is a wILL, there is always a way" ;
            String find="there";
            String expected[]={"found_at:6-11","found_at:23-28"};
            //act and assert
            assertArrayEquals(expected, fm.multiOccure(str, find));
        }
}
