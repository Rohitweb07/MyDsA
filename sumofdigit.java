import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
	   int n=10;
	   int res=solve(n);
	   System.out.print(res);
	   
	   
		
		
	}
	static int solve(int n)
	{
	    if(n==0)
		{
			return 0;
		}
		int x=n%10;
		return x+solve(n/10);
	}
}
