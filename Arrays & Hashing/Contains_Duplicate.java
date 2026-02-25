/*
Problem: Contains Duplicate
Link: https://leetcode.com/problems/contains-duplicate/

Idea: Sort the array and check if any consecutive elements are equal.
Time Complexity: O(n log n) → sorting dominates
Space Complexity: O(1) → only constant extra space used
*/

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;              // length of the array

        Arrays.sort(nums);                // sort the array first

        // check consecutive elements for duplicates
        for (int i = 0; i < n - 1; i++) { // loop runs n-1 times
            if (nums[i] == nums[i + 1]) { // if two neighbors are equal
                return true;              // duplicate found
            }
        }

        return false;                     // no duplicates found
    }
}
