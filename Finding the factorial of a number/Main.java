import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print(Fact(n));
  }
  public static int Fact (int n)
  {
    if(n==0)
    {
      return 1;
    }
    else
    {
      return n*Fact(n-1);
    }
  }
}