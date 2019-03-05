import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   Scanner sc=new Scanner (System.in);
       int n,i,digit,sum=0,f=1;
       int num;
       n=sc.nextInt();
       num=n;
       while(n>0)
       {
         digit=n%10;
         f=1;
         for(i=1;i<=digit;i++)
         {
           f=f*i;
         }
         sum=sum+f;
         n=n/10;
       }
      if(sum==num)
           System.out.println("Yes");
      else
           System.out.println("No");
	}
}