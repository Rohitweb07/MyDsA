public class Solution
{
    public static void main(String args[])
    {
        int arr[]={10,5,20,8};
        int max=0;
        int j=0;
        System.out.print(secondlargest(arr));
      
       
    }
    public static int largestElement(int arr[])
    {
        int n=arr.length;
        int max=0;
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                j=i;
            }
        }
        return j; 
    }
    public static int secondlargest(int arr[])
    {
        int largest=largestElement(arr);
        int res=-1;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr[largest])
            {
                if(res==-1)
                {
                    res=i;
                }
                else if(arr[i]>arr[res])
                res=i;
            }
        }
        return res;
    }
}
