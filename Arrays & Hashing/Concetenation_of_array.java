/*
Problem: Concatenation of Array
Link: https://leetcode.com/problems/concatenation-of-array/

Idea: Create a new array of size 2*n and copy the original array twice.
Time Complexity: O(n)  → we loop through the array once
Space Complexity: O(n) → extra array of size 2*n
*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;              // length of original array
        int ans[] = new int[2 * n];       // new array of double size

        // copy elements twice
        for (int i = 0; i < n; i++) {     // loop runs n times
            ans[i] = nums[i];             // copy element to first half
            ans[i + n] = nums[i];         // copy element to second half
        }

        return ans;                       // return concatenated array
    }
}
