// navie solution


import java.io.*;
import java.lang.*;
 class Search
{
    public static void main(String args[])
    {
    
     Solution s=new Solution();
     int result=s.gcd(36,60);
    
     System.out.print(result);
         
    }
}
class Solution
{
    public static int gcd(int a,int b)
    {
        int res=Math.min(a,b);
        while(res>0)
        {
            if((a%res==0) && (b%res==0))
                    break;
                    
            res--;        
        }
        return res;
    }
}
    
// time complexcity O(min(a,b))







// Euclid Algorithm


//***** number 1


import java.io.*;
import java.lang.*;
 class Search
{
    public static void main(String args[])
    {
    
     Solution s=new Solution();
     int result=s.gcd(36,60);
    
     System.out.print(result);
         
    }
}
class Solution
{
    public static int gcd(int a,int b)
    {
      while(a!=b)
      {
          if(a>b)
          {
              a=a-b;
          }
          if(b>a)
          {
            b=b-a;
          }
      }
      return a;
    }
}
    




//***** number 2

// Time compexcity====>O(log(min(a,b));


import java.io.*;
import java.lang.*;
 class Search
{
    public static void main(String args[])
    {
    
     Solution s=new Solution();
     int result=s.gcd(36,60);
    
     System.out.print(result);
         
    }
}
class Solution
{
    public static int gcd(int a,int b)
    {
      if(b==0)
        return a;
        
        
        return gcd(b,a%b);
    }
}
    

