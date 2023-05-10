import java.util.Scanner;
public class DuplicateString{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str=sc.nextLine();

       char[] ch= str.toCharArray();
   for(int i=0;i<ch.length-1;i++)
  {
    int count =1;
    for(int j=i+1;j<ch.length;j++)
        {
        if(ch[i]==ch[j])
           {
             count++;
              ch[j] ='o';
            } 
         }
       if(count>1 && ch[i] != 'o')
       {
           System.out.print(ch[i]);
        }
         
     
   }
}
}