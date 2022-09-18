public class MyClass {
    public static void main(String args[]) {
      int arr[]={30,5,20};
      int n =arr.length;
      int one =arr[0];
      int i;
      for( i=0;i<n-1;i++)
      {
          arr[i]=arr[i+1];
      }
      arr[i]=one;
      for(int j=0;j<arr.length;j++)
      {
          System.out.print(arr[j]+" ");
      }
      
    }
}
