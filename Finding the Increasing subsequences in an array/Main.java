import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int [n];
     for(int i=0;i<n;i++)
     {
       a[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++)
     {
       for(int j=i+1;j<n;j++)
       {
         if((a[j]-a[i])>=1)
         {
           System.out.println(a[i]+","+a[j]);
         }
       }
     }
     
  }
}