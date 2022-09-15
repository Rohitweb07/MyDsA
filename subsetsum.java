// time complexcity O(2^n)


import java.util.*;
class Main {
	public static void main(String args[]) {
		
		int arr[]={10,5,2,3};
		int n=arr.length;
		int k=10;
		System.out.print(solve(arr,n,k));
		
		
		
		
		
	}
	static int solve(int arr[],int n,int k)
	{
		if(n==0)
		{
			return k==0?1:0;
			
		}
		
		return solve(arr,n-1,k)+solve(arr,n-1,k-arr[n-1]);
	}
}
