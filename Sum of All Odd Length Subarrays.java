// 1588. Sum of All Odd Length Subarrays
// Easy

// 2522

// 195

// Add to List

// Share
// Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

// A subarray is a contiguous subsequence of the array.

 

// Example 1:

// Input: arr = [1,4,2,5,3]
// Output: 58
// Explanation: The odd-length subarrays of arr and their sums are:
// [1] = 1
// [4] = 4
// [2] = 2
// [5] = 5
// [3] = 3
// [1,4,2] = 7
// [4,2,5] = 11
// [2,5,3] = 10
// [1,4,2,5,3] = 15
// If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58



class Solution {
    public int sumOddLengthSubarrays(int[] nums) {
       // for every element of index i (idex-1)*(n-1);  importnat concept
        // odd length subarray (idex-1)*(n-1)+1/2;
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=(((i+1)*(nums.length-i)+1)/2)*nums[i];
        }
       return sum;
    }
}
