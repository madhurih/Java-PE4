package com.stackroute.pe4;

public class SortParagraph
{
    public String[] sortWords(String para)
    {
        String[] words;
        words = para.split("\\s"); //splits the string based on whitespace

        for (int i = 0; i < words.length; i++)
        {
            for (int j = i + 1; j < words.length; j++)
            {
                if (words[i].compareTo(words[j]) > 0)  //compare each word with other
                {
                    String temp = words[i];  //swapping
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words; //returns sorted para
    }
}
