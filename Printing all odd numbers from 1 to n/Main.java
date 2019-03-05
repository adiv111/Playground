import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	     // Type your code here
      Scanner sc=new Scanner (System.in);
      int n;
      n=sc.nextInt();
      for(int i=1;i<=n;i+=2)
      {
        System.out.println(i+" ");
      }
	}
}