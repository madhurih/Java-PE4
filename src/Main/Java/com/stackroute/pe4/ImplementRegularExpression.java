package com.stackroute.pe4;

public class ImplementRegularExpression
{
    public Boolean findPresence(String str1, String find)
    {
        boolean isPresent = str1.contains(find);  //find presence of string using contains method
        return isPresent;  //returns boolean value
    }
}