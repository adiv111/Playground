import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
   // StringBuilder sb=new StringBuilder (s);
    String w="";
    char ch;
    int l=s.length();
    for(int i=0;i<l;i++)
    {
      ch=s.charAt(i);
      if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')
      {
        w=w+ch;
      }
    }
    System.out.print(w);
  }
}