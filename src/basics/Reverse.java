import java.util.Scanner;
public class Reverse{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str=sc.nextLine();
String[]carr=str.split(" ");
for(int i=carr.length-1;i>=0;i--)
{
System.out.print(carr[i]+ " ");
}
}}
