package arrays;

class CheckWheatherTwoArraysAreEqual
  {
   public static void main(String[] args)
  {
    int arr1[] ={1,2,3,4,5};
    int arr2[] ={1,2,3,4,5};
    
      boolean status =  true;
    if(arr1.length==arr2.length)
     {
       for(int i=0;i<arr1.length;i++)
       {
         if(arr1[i]!=arr2[i])
        {
           status = false;
        }
      }
    }
 else
      {
        status = false;
      }  
    if(status==true)
     {
     System.out.println("both the arrays are equal");
     }
    else
    {
     System.out.println("both the arrays are not equal");
    }
}
}
