public class World 
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.println("enter array size");
int size = sc.nextint();

int arr[]=new int[size];

for(int i=0;i<size;i++)
{
   arr[i]=sc.nextint();
}

for(int i=0;i<=arr.length;i++)
{
   for(int j=i+1;j<arr.length;j++)
   {  
        if(arr[i]<arr[j])
        {  
          
         int temp = arr[j];

          arr[j]=arr[i];
          arr[i]=temp;
        }
   } 
}

System.out.println("Array after sorting"+Arrays.toString(arr));
}
}

            