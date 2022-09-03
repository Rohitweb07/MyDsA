// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21

//77.1%faster solution
class Solution {
    public int reverse(int x) {
         int res = 0;
        while(x !=0)
        {
            int temp = x%10;
            res = res*10+temp;
           x = (x)/10;
            
            if(res%10!=temp) //exceed int range
            {
                return 0;
            }
        }
        
        return res;
    }
}

//100%faster code same code but change in line 49

class Solution {
    public int reverse(int x) {
         int res = 0;
        while(x !=0)
        {
            int temp = x%10;
            res = res*10+temp;
           x = (x-temp)/10;
            
            if(res%10!=temp) //exceed int range
            {
                return 0;
            }
        }
        
        return res;
    }
}
