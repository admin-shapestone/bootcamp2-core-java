class CalculateStudentPercentageMarks
{
 public static void main(String[] args)
{
    int sum=0;
   int marks[] = {44,65,34,44,54,55};

    for(int i=0;i<marks.length;i++)  
    {  
    if(marks[i] >= 35)
     {
       sum = sum + marks[i];
     }
    else 
     {
      System.out.println("student resukt  :: fail");
      
     }
   }  
   float percentage = sum/6;
  System.out.println("percentage : : "+ percentage);
   
   if(percentage > 80)
   { 
     System.out.println("Student result :: Grade = A");
   }
   else if (percentage >75 && percentage <80)
    {
      System.out.println("Student result :: Grade = B");
    }
   else if(percentage >50 && percentage < 75)
    {
      System.out.println("Student result :: Grade = C");
    }
   else if (percentage >= 35  && percentage < 50)
   {  
    System.out.println("Student result :: Grade = D");
   }
  else 
   {
   System.out.println("Student result :: fail");
   }

}
}
   
  
 

