class FindHighestLowestNumInArray
  {
   public static void main(String[] args) 
  {
     
    int arr[] ={1,5,43,5,43,4,98,6};
    int big = arr[0];
     int small = arr[0];
      for(int i=0;i<arr.length;i++) 
     {
        if(arr[i] < big )
        {
           big = arr[i];
         }
         
       }

System.out.print(big+"   "+small);

}
}


