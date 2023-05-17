class FirstSecondThirdHighestNum
{
  public static void main(String[] args)
 
 {
    int first=0,second=0,third=0;
   int arr[] ={1,5,3,4,5,8,7,5,54};
   for(int i=0;i<arr.length;i++)
   {
      if(arr[i]>first)
     {
       third = second;
        second = first;
         first = arr[i];
      }
     else if(arr[i]>second)
     {
      second = first;
      first = arr[i];
    }
    else if(arr[i]>third)
   {
    third = arr[i];
   } 
  }
 System.out.println(first+" "+second+" "+third);

}
}
