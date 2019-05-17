package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMultipleOccurrences
{
     public String[] multiOccure(String str, String find)
     {
            Pattern pattern = Pattern.compile(find);  //accepted pattern of the input String to find
            Matcher matcher = pattern.matcher(str);  // Created a matcher for the input String
            StringBuffer read = new StringBuffer(""); //create Stringbuffer object
            while (matcher.find())
            {
                read.append("found_at:" + matcher.start() + "-" + matcher.end() + "\n");
            }
            return read.toString().split("\n"); // return result
     }
}
