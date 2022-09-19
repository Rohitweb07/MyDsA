I/P:[0,2,1,5,3,4]
o/p:5 4
  
  
  
  public class MyClass {
    public static void main(String args[]) {
      int arr[]={0,2,1,5,3,4};
      
      for(int i=0;i<arr.length;i++)
      {
          boolean check=false;
      
          for(int j=i+1;j<arr.length;j++)
          {
              if(arr[i]<=arr[j])
              {
                  check=true;
                  break;
              }
          }
          if(check==false){
              System.out.print(arr[i]+" ");
          }
      }
    }
}



//---------------------------------------**************------------------------------------------------------




public class MyClass {
    public static void main(String args[]) {
      int arr[]={0,2,1,5,3,4};
      int n=arr.length;
      int currEle=arr[n-1];
      System.out.print(currEle+" ");
      int i;
      for(i=n-1;i>=0;i--)
      {
          if(currEle<arr[i])
          {
              currEle=arr[i];
               System.out.print(currEle+" "); 
          }
         
      }
      
    }
}

O(n);
