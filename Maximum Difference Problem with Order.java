public class MyClass {
    public static void main(String args[]) {
    int arr[]={2,3,10,6,4,8,1};
    int n=arr.length;
   int res=arr[1]-arr[0];
   int minval=arr[0];
   for(int j=1;j<n;j++)
   {
       res=Math.max(res,arr[j]-minval);
       minval=Math.min(minval,arr[j]);
   }
    
    System.out.print(res);
    }
}
o/p:8;
timeCompexcity O(n); 
