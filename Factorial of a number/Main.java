import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
       Scanner sc=new Scanner (System.in);
      int n,i,f=1;
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        f=f*i;
      }
      System.out.println(f);
	}
}