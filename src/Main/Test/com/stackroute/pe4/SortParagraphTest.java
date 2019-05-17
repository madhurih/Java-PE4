package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortParagraphTest
{
    public static SortParagraph sp;

    @BeforeClass
    public static void setup()
    {
        //arrange
        sp = new SortParagraph();

    }

    @AfterClass
    public static void teardown()
    {
        //arrange
        sp = null;

    }

    @Test
    public void sortWordsTest_ExistingParaGiven_ShouldReturnSortedPara()
    {
        //arrange
        String str = "java is a programming language created by james gosling from sun microsystems in.";
        String[] expected = {"a", "by", "created", "from", "gosling", "in.", "is", "james", "java", "language", "microsystems", "programming", "sun"};
        //act and assert
        assertArrayEquals(expected, sp.sortWords(str));
    }
}
