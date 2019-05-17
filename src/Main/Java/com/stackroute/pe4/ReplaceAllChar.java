package com.stackroute.pe4;

public class ReplaceAllChar
{
    public String replaceChar(String str)
    {
        String result1 = str.replaceAll("d", "f"); //replace all d with f
        String result2 = result1.replaceAll("l", "t"); //replace all l with t
        return result2;  //returnfinal result
    }
}
