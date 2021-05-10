
import java.util.Scanner;
public class LabArray14{
    public static void main(String[] args) {
        int sumrow=0,sumcolumn=0,total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns in matrix: ");
        int column = sc.nextInt();

        int[][] mat = new int[row][column];

        System.out.println("Enter the " + row*column+ " integers:");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nInput:");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nOutput: ");
        for (int i=0;i<row;i++){
            sumrow=0;
            for (int j=0;j<column;j++){
                sumrow += mat[i][j];
                total += mat[i][j];
                System.out.print(mat[i][j] + "\t");
            }
            System.out.print(sumrow);
            System.out.println();
        }

        for (int i=0;i<column;i++){
            sumcolumn =0;
            for (int j=0;j<row;j++){
                sumcolumn += mat[j][i];
            }
            System.out.print(sumcolumn + "\t");
        }
        System.out.print(total);




    }
}
//            if (column>1) {
//                System.out.print(total);
//            }