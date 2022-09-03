package assigmet;

import java.util.*;

//Program to count the frequency of the elements in a list
class CountOfWords
{
 public static void main(String[] args)
 {
     List<String> list = Arrays.asList("hindi", "marathi", "telugu", "kannada", "telugu", "hindi");

     Set<String> distinct = new HashSet<>(list);
     for (String s: distinct) {
         System.out.println(s + ": " + Collections.frequency(list, s));
     }
 }
}