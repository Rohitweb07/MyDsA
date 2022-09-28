import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     int arr1[]={10,12,15};
     int arr2[]={18,12};
     
     HashSet<Integer>h1=new HashSet<Integer>();
      //ArrayList<Integer>li=new ArrayList<Integer>();
     // int count=0;
      for(int i=0;i<arr1.length;i++)
      {
          h1.add(arr1[i]);
      }
      for(int i=0;i<arr2.length;i++){
         h1.add(arr2[i]);
          
          }
      
      
      System.out.print(h1.size());
      System.out.print(h1);
     
    }
}
O(M+N)
