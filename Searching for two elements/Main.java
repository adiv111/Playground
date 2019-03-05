import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[]=new int[arr_size];
      for(int idx=0;idx<=arr_size-1;idx++){
        arr[idx]=in.nextInt();
      }
      int serr_elem1 = in.nextInt();
      int serr_elem2 = in.nextInt();
      int elem1=-1;
        int elem2=-1;
      for(int idx=0;idx<=arr_size-1;idx++){
        if(serr_elem1==arr[idx]){
          elem1=idx;          
        }
        if(serr_elem2==arr[idx]){
          elem2=idx;
        }
      }
        System.out.println(elem1);
       System.out.println(elem2);      
      }
    }
