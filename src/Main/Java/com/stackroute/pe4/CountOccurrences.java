package com.stackroute.pe4;

public class CountOccurrences
{
    public int countChar(String str)
    {
        int charcount = str.length() - str.replaceAll("e", "").length(); //give char count by replacing the e with blank
        return charcount;  //return char count
    }

}
