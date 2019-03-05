import java.util.Scanner;
class Main{
  public static int power_no(int base,int expo){
    int pow = 1;
    while(expo>=1){
      pow=pow*base;
      expo--;
    }
    return pow;
  }     
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      System.out.println(power_no(n1,n2));
    }
}