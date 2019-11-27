/**
 *  Rafsan Ahmed | EMPLID: 14031514
 *  Assignment 3
 *  CISC 3130 - Data Structure
 *  Prof. Katherine Chuang
 *  Section - MY9
 *  FALL 2019
 **/

//import necessary packages  
import java.util.*;
import java.io.*;
    
/**
 *
 * Following programm take lyrics of song "Starman" by "David Bowie" as a .txt file input 
 * after taking the .txt file it use a data structure to analyze the data and count the frequency of all the unique words of the .txt file 
 * programm then print all the unique word and number of there appearneces in the .txt file.
 *
 **/
public class WordFrequencies
{
 public static void main(String[] args) throws FileNotFoundException
 {
  /**
   *
   * this programm use following data structure to analyze the data. TreeMap is a Red-Black tree based NavigableMap implementation.
   * Unlike LinkedHashMap and HashMap this data structure does not use hashing for storing keys.
   * i chosed this perticular data structure mainly because it is simple and it also print output in alphabetical order which looks nice then random word list. 
   * HashMap has no ordering when you iterate through it; TreeMap iterates in the natural key order.   
   *
   **/
  Map<String, Integer> frequencies = new TreeMap<String, Integer>(); 
  
  // following line of the code take "lyrics.txt" file as an user input
  Scanner in = new Scanner(new File("lyrics.txt"));
  
  while (in.hasNext())
  {
   String word = clean(in.next());    
   
    /**
     *
     * this part of the code use an if-else statement to count the frequencie of word
     * if there is none then it put 1 or otherwise increment the counting procces 
     *
     **/
    Integer count = frequencies.get(word);
   
    if (count == null) 
    { 
     count = 1; 
    }
    else 
    { 
     count = count + 1; 
    }        
     frequencies.put(word, count);
  }
   
  /**
   *
   * this section of the code print the result
   *
   **/
  for (String key : frequencies.keySet())
  {
   System.out.printf("%-20s%20d\n", key, frequencies.get(key));
  }
 }

 /**
  *
  * this section of the code removes charechtars from a string that are not letters. 
  * @para s: a string
  * @return a string with all the letters
  *
  **/
public static String clean(String s)
{
  String r = "";
  for (int i = 0; i < s.length(); i++)
  {
   char c = s.charAt(i);
     if (Character.isLetter(c))
     {
       r = r + c;
     }
  }
  return r.toLowerCase();
 }
}