/*
Problem: Valid Anagram
Link: https://leetcode.com/problems/valid-anagram/

Idea: Convert both strings to char arrays, sort them, and compare.
Time Complexity: O(n log n) → sorting dominates
Space Complexity: O(1) → constant extra space (ignoring input storage)
*/

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // Anagram → same letters arranged in different order

        if (s.length() != t.length()) {   // if lengths differ, not an anagram
            return false;
        }

        // convert strings to char arrays
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr1);                // sort first array
        Arrays.sort(arr2);                // sort second array

        // check if sorted arrays are equal
        if (Arrays.equals(arr1, arr2)) {
            return true;                  // strings are anagrams
        } else {
            return false;                 // strings are not anagrams
        }
    }
}
