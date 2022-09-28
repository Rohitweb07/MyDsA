import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     int arr1[]={10,15,20,30,30,5};
     int arr2[]={30,5,30,80};
     
     HashSet<Integer>h1=new HashSet<Integer>();
      ArrayList<Integer>li=new ArrayList<Integer>();
      int count=0;
      for(int i=0;i<arr1.length;i++)
      {
          h1.add(arr1[i]);
      }
      for(int i=0;i<arr2.length;i++){
          if(h1.contains(arr2[i]))
          {
             count++;
          li.add(arr2[i]);
          h1.remove(arr2[i]);
          
          }
      }
      
      System.out.print(li.size());
      System.out.print(li);
     
    }
}
      //O(M+N)
