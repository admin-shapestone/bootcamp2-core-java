
class CalculateStudentPercentageByUsingSwitch
{
 public static void main(String[] args)
{

  int marks[] = {44,65,77,54,66,55};
   int sum = 0;
  String grade ="";
  for(int i=0;i<marks.length;i++)
   {
     if(marks[i]>=35)
     {
       sum = sum + marks[i];
     }
    else
    {
      break;
    }
   }  
    float percentage = sum/6;
System.out.println("percentage = "+percentage);
      int num = (int) (percentage);
     switch(num/10)
   {
     case 10:
      grade = "A";
      break;
    case 8:
      grade = "B";
      break;
    case 6:
      grade = "C";
      break;
    case 4:
      grade = "D";
      break;
    default :
       grade = "fail";
       break;
   }
 System.out.println("Grade = "+grade);
}
}



 //       o/p = percentage = 60.0
 //      Grade = C