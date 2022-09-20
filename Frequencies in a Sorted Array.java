public class MyClass {
    public static void main(String args[]) {
    int arr[]={0};
    int n=arr.length;
    int visited=-1;
    for(int i=0;i<n;i++)
        {       int count=0;
               if( visited==arr[i])
               {
                continue;
                }
      for(int j=0;j<n;j++)
        { 
            
             if(arr[i]==arr[j])
            {
                count++;
            }
        }
        
         visited=arr[i]; 
         System.out.println("for"+arr[i]+":"+count);
    }
   
   
    }
}

Time O(n^2)
  
  //-----------------------------------------******************----------------------------
  public class MyClass {
    public static void main(String args[]) {
    int arr[]={10,10,25,30,30,30};
    int n=arr.length;
    int flag=1;
    int i=1;
    
    while(i<n)
    {
        while(i<n && arr[i]==arr[i-1])
        {
            flag++;
            i++;
        }
        System.out.println(arr[i-1]+":"+flag);
        
        i++;
        flag=1;
    }
   
    }
}
