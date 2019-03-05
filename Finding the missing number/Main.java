import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int freq[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
       for(int i=0;i<=n;i++)
        {
          freq[i]=0;
        }
       for(int i=0;i<n;i++)
        {
         int a=arr[i];
         freq[a]++;
        }
       for(int i=0;i<=n;i++)
        {
          if(i!=0 && freq[i]==0)
          {
            System.out.print(i);
          }
        }
    }
}