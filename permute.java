import java.util.*;
public class Solution
{
	
	public static void main(String args[])
	{
		String str="ABCD";
		int i=0;
		
		permut(str,i);
		
		
		
	}
	static String swap(String str,int i,int j)
	{
		char arr[]=str.toCharArray();
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		return String.valueOf(arr);
		
	}
	
	static void permut(String str,int i)
	{
		if(i==str.length()-1)
		{
			System.out.print(str+" ");
		}
		else
		for(int j=i;j<str.length();j++)
		{
		str=	swap(str,i,j);
			permut(str,i+1);
			
			str=swap(str,i,j);
		}
	}
}
