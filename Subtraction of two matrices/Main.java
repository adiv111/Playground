import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix1[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix1[i][j] = in.nextInt();
      }
    }
    int matrix2[][] = new int[c][r];
     for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix2[i][j] = in.nextInt();
      }
    }
    int subtract[][] = new int[c][r];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        subtract[i][j]=matrix1[i][j]-matrix2[i][j];
      }
    }
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        System.out.print(subtract[i][j]+" ");
      }
      System.out.println();
    }
  }
}