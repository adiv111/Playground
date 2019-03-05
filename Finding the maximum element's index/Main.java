import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int max_idx;
    for(int idx=0;idx<n;idx++){
       arr[idx] = in.nextInt();
    }
    if(arr[0]>arr[1]){
      max_idx=0;
    }
    else{
      max_idx=1;
    }
    for(int idx=2;idx<=n-1;idx++){
      if(arr[max_idx]<arr[idx]){
        max_idx=idx;
      }
    }
    System.out.println(max_idx);
  }
}