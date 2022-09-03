// Digits In Factorial
// EasyAccuracy: 48.64%Submissions: 92530Points: 2
// Given an integer N. Find the number of digits that appear in its factorial. 
// Factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.
 

// Example 1:

// Input: N = 5
// Output: 3
// Explanation: Factorial of 5 is 120.
// Number of digits in 120 is 3 (1, 2, and 0)
 

// Example 2:

// Input: N = 120
// Output: 199
// Explanation: The number of digits in
// 120! is 199

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function




class Solution{
    public int digitsInFactorial(int N){
        // code here
        if(N==0)
           return 0;
        if(N<=1)
        
            return 1;
        
        double sum=0;
       for(int i=1;i<=N;i++)
         sum+=Math.log10(i);
       
    
    return ((int)Math.floor(sum))+1;
    }
}
