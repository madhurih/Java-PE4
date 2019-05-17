package com.stackroute.pe4;

public class TransposeString
{
        public String transposeOfString(String str)
        {
            String[] words = str.split("\\s"); //splits the string based on whitespace
            String transWord = "";
            for(String w:words) //for each word
            {
                StringBuilder sb = new StringBuilder(w); //create stringbuilder object
                sb.reverse(); //reverse the string using reverse method
                transWord += sb.toString() + " "; //store whole arrays elements as single string
            }
            return transWord;  //return string
        }
}