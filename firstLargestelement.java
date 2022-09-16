public class Solution
{
    public static void main(String args[])
    {
        int arr[]={10,5,20,8};
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
        System.out.print(arr[j]+" "+j);
    }
}
