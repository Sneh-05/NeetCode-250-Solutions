/*
Problem: Two Sum
Link: https://leetcode.com/problems/two-sum/

Idea: Check every pair of numbers to see if they add up to target.
Time Complexity: O(n^2) → nested loops
Space Complexity: O(1) → only constant extra space used
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length; 
        int arr[] = new int[2]; // Initialize an array to store the result indices
        for (int i = 0; i < n; i++) {
            // For each element, check all subsequent elements
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the two elements equals the target
                if (nums[i] + nums[j] == target) {
                    arr[0] = i; 
                    arr[1] = j; 
                    return arr; // Return the result as soon as a valid pair is found
                }
            }
        }
        // If no valid pair is found, return the default array [0, 0]
        return arr;
    }
}