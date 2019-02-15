package com.cognizant;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
    	if (a.length() != b.length())
    		return false;
    	char[] sortedA = a.toCharArray();
    	char[] sortedB = a.toCharArray();
    	Arrays.sort(sortedA);
    	Arrays.sort(sortedB);
    	return Arrays.equals(sortedA, sortedB);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
