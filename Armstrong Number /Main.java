import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   Scanner sc=new Scanner (System.in);
      int n,n1,num,sum=0,f=0;
      int digit;
      n=sc.nextInt();
      num=n;
      n1=n;
      while(n>0)
      {
        digit=n%10;
        f++;
        n=n/10;
      }
      while(num>0)
      {
        digit=num%10;
        sum=sum+(int)(Math.pow(digit,f));
        num=num/10;
      }
      if(n1==sum)
          System.out.println("Armstrong Number");
      else
          System.out.println("Not a Armstrong Number");
	}
}