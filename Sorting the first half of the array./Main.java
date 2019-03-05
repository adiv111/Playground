import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int temp=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int middle=n/2;
    for(int i=0;i<(middle)-1;i++)
    {
      for(int j=0;j<(middle)-1-i;j++)
      {
        if(a[j]>a[j+1])
        {
          temp=a[j+1];
          a[j+1]=a[j];
          a[j]=temp;
        }
      }
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}