import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner (System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    int count=0;
    int len1=s1.length();
    int len2=s2.length();
    for(int index_1=0;index_1<(len1-len2+1);index_1++)
    {
      boolean is_match=true;
      for(int index_2=0;index_2<len2;index_2++)
      {
        if(s1.charAt(index_1+index_2)!=s2.charAt(index_2))
        {
          is_match=false;
        }
      }
      if(is_match==true)
      {
        count=count+1;
      }
    }
    System.out.println(count);
  } 
}