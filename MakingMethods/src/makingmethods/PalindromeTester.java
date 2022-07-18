/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package makingmethods;

/**
 * Nawaal Fatima
 * 8th November,2017
 * ParlindromeTester.java
 * Program used to check whether or not a given word is a palindrome, excluding punctuation.
 * @author fatin9973
 */
import java.util.Scanner;
public class PalindromeTester {

    public static String reverseString(String word)
    {
        String reverseWord="";
       int length=word.length();
        for(int i=length-1;i>=0;i--)
        {
             reverseWord=reverseWord+word.charAt(i);
             
        }
        
        return reverseWord;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word .");
        String word=scan.nextLine();
        
        word=word.replaceAll("\\W", "");
        String reverseLine=reverseString(word);
        reverseLine=reverseLine.replaceAll("\\W", "");
      
        
        if(word.equalsIgnoreCase(reverseLine))
        {
             System.out.println("Yes,it is a palindrome");
        }
        else
        {
            System.out.println("No,it is not a palindrome");
        }
    }
    }

            
            


