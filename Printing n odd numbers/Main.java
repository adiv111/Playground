import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    Scanner sc=new Scanner (System.in);
      int n,i,count=1;
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        System.out.println(count);
        count=count+2;
      }
	}
}