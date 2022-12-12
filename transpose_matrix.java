import java.util.Scanner;
public class transpose_matrix {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int [][]arr=new int[row][col];  int [][]transpose=new int [row][row];
        for(int r = 0; r< arr.length; r++)
        {
            for (int c=0; c< arr[r].length; c++) {
                arr[r][c] = in.nextInt();
            }
        }
        System.out.println("befor transpose_matrix:");
        for(int r = 0; r< arr.length; r++)
        {
            for (int c=0; c< arr[r].length; c++) {
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("after transpose_matrix: ");
        for(int r = 0; r< arr.length; r++)
        {
            for (int c=0; c< arr[r].length; c++) {
                transpose[r][c]=arr[c][r];
            }
        }
        for(int r = 0; r< transpose.length; r++) {
            for (int c = 0; c < transpose[r].length; c++) {
                System.out.print(transpose[r][c] + " ");
            }
            System.out.println();
        }
    }
}
