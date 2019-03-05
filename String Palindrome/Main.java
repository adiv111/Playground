import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       String s2="";
       int len =s1.length();
       char ch;
       for(int index=0;index<len;index++)
       {
         ch=s1.charAt(index);
         s2=ch+s2;
       }
       if(s1.equals(s2))
          System.out.println("Yes");
      else
          System.out.println("No");
    } 
}