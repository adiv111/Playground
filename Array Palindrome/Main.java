import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr_size=sc.nextInt();
        int arr[]=new int[arr_size];
        for(int i=0;i<arr_size;i++)
        {
          arr[i]=sc.nextInt();
        }
        boolean is_pal=true;
        int left=0;
        int right=arr_size-1;
        while(left<=right)
        {
          if(arr[left]!=arr[right])
          {
            is_pal=false;
            break;
          }
          left++;
          right--;
        }
      if(is_pal==true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    }
}