import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int idx=0;idx<n;idx++){
        arr[idx]=in.nextInt();
      }
      int val = in.nextInt();
      perfect_couple(n,arr,val);
    }
  public static void perfect_couple(int n,int arr[],int val){
    int sum;
    for(int idx_1=0;idx_1<=n-1;idx_1++){
      for(int idx_2=idx_1+1;idx_2<=n-1;idx_2++){
         sum = arr[idx_1] + arr[idx_2];
      if(sum==val){
        System.out.println(arr[idx_1]+ "," + " " + arr[idx_2]);
      }
    }
  }      
}
}