class Palinedrome
{

public static void main(String[] args)
{

 String str = "madam";
   //char ch[]=str.toCharArray();
  String revStr ="";

   for(int i=str.length()-1;i>=0;i--)
   { 
     revStr=revStr+str.charAt(i);

   }
    System.out.println(revStr);

    if(str.equals(revStr))
    {
       System.out.println("its a palinedrome");
    }
    else
      System.out.println("not a palinedrome");
}
}
      
