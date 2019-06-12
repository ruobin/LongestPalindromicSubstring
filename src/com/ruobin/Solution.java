package com.ruobin;

/**
 * Created by Ruobin Wang on 2019-06-10.
 */
public class Solution {

    public static boolean isPalindromic(char[] array, int i, int j) {

        if (i>=j) return true;

        if (i+1==j && array[i]==array[j]) return true;

        return isPalindromic(array, i+1, j-1) && array[i]==array[j];
    }

    public static String maxLengthOfPalindromicSubstring(String s) {
        int maxLengthOfPalindromicSubstring = 0;
        int targetStart = 0;
        int targetEnd = 0;
        for (int i=0; i<s.length(); i++) {
            for (int j=i+1; j<s.length();j++) {
                if (isPalindromic(s.toCharArray(), i, j)) {
                    if (maxLengthOfPalindromicSubstring < j-i+1) {
                        maxLengthOfPalindromicSubstring = j-i+1;
                        targetStart = i;
                        targetEnd = j;
                    }
                }
            }
        }

        return s.substring(targetStart, targetEnd+1);
    }
}
