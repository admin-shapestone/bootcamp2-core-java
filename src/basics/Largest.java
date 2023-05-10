public class Largest
{
public static void main(String[] args)
{
          int first=0,secound=0,third=0;
         int[]arr={1,2,33,4,55,11};
  for(int i=0;i<arr.length;i++)
     {
        if (arr[i]>first) 
          { 
           third=secound;
            secound=first;
             first=arr[i];
          }
            else if(arr[i]>secound)
            {
             third = secound
;
            secound=arr[i];
            }
           else if( arr[i]>third)
          { 
           third=arr[i];
          }
          
      }
System.out.println("secound heigest number is" + secound);
System.out.println("first heigest number is"+first);
System.out.println("third heigest number is"+third);

}
}