class CalculateByteRange
{
 public static void main(String[] args)
{
   byte base = 2;
   byte power = 1;
   byte exponent = 3;
  
   while(exponent>0)
{
  power = power*base;
  exponent--;
}

System.out.println(power);
}
}