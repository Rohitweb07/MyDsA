public class MyClass {
    public static void main(String args[]) {
      int arr[]={1,2,3,0,0,4,0,8};
      int count=0;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]!=0)
          {
          swap(arr,i,count);
          count++;
          }
      }
      for(int i=0;i<arr.length;i++)
      {
          System.out.print(arr[i]+" ");
      }
      
      
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
