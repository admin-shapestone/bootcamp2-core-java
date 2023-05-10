class removeDublicateWords
{ 

 public static void main(String[] args)
{
    int count;
   String str ="abhia";
 
    char[] ch =str.toCharArray();
   
   for(int i=0;i<ch.length;i++)
    {
      count=1;
         for(int j=i+1;j<ch.length;j++)
             {
                if(ch[i]==ch[j]&& ch[i]!=' ')
              {  
                  count++;
                  ch[j]='o';
              }
             }
            if(count>1 && ch[i]!='o')
             {
               System.out.println(ch[i]);
              }
     }
                   

 }
}
