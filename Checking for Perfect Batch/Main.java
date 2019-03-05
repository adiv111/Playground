import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int idx=0;idx<n;idx++){
      arr[idx]=in.nextInt();
    }
    sum_3_check(arr,n);
  }
   
   public static void sum_3_check(int arr[],int n){
    boolean is_sum=true;
    int batch_sum=arr[0]+arr[1]+arr[2];
    for(int idx=3;idx<=n-1;idx=idx+3){
      int curr_batchsum = arr[idx] + arr[idx + 1] + arr[idx + 2];
      if(curr_batchsum != batch_sum){
        is_sum=false;
      }
    }
     if(is_sum==true){
       System.out.println("Perfect Batch");
     }
     else{
       System.out.println("Not a Perfect Batch");
     }
   }
}