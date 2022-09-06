//----------------------naive approch------------------

//Time compexcity======>O(max(a,b));

import java.io.*;
import java.lang.*;
 class Search
{
    public static void main(String args[])
    {
    
     Solution s=new Solution();
     int result=s.lcm(15,25);
    
     System.out.print(result);
         
    }
}
class Solution
{
    // public static int gcd(int a,int b)
    // {
    //   if(b==0)
    //     return a;
        
        
    //     return gcd(b,a%b);
    // }
    static int lcm(int a,int b)
    {
           int res=Math.max(a,b);
           while(true)
           {
               if((res%a==0 && res%b==0))
                       
                       return res;
               res++;
           }
    }
}
   

//------------------------------Efficent way---------------------------------



// Time complexcity=====>Olog(min(a,b))+O(1)==>
//                                       Olog(min(a,b)


import java.io.*;
import java.lang.*;
 class Search
{
    public static void main(String args[])
    {
    
     Solution s=new Solution();
     int result=s.lcm(15,25);
    
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
    static int lcm(int a,int b)
    {
        //   int res=Math.max(a,b);
        //   while(true)
        //   {
        //       if((res%a==0 && res%b==0))
                       
        //               return res;
        //       res++;
        //   }
        
        return a*b/gcd(a,b);
    }
}
    

