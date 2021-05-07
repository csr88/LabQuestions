import java.util.Scanner;
public class LabArray13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix: ");
        int row = sc.nextInt();;

        System.out.println("Enter the number of columns in matrix: ");
        int column = sc.nextInt();

        int[][] mat1 = new int[row][column];
        int[][] mat2 = new int[row][column];
        int[][] res = new int[row][column];

        System.out.println("Enter the " + row*column + " integers in first matrix: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the " + row*column + " integers in second matrix: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("\nAddition result: ");
        for (int i=0;i<row;i++){
          for (int j=0;j<column;j++){
              System.out.print(res[i][j] + "\t");
          }
            System.out.println();
        }


    }
}
