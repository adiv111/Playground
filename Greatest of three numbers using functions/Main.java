import java.util.Scanner;
class Main{
  public static int great_2_nos(int num1,int num2){
    int great;
    if(num1>num2){
       great=num1;
    }
    else{
       great=num2;
    }
    return great;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
          int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int result=great_2_nos(n1,n2);
      System.out.println(great_2_nos(n3,result));
	}
}