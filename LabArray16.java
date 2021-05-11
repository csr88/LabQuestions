import java.util.Scanner;
public class LabArray16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        int column = sc.nextInt();

        int[][] mat = new int[row][column];
        System.out.println("Enter the " + row*column + " integers: ");
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Given matrix: ");
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        int row2 = column;
        int column2 = row;
        int[][] mat2 = new int[row2][column2];

        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                mat2[j][i] = mat[i][j];
            }
            System.out.println();
        }

        System.out.println("Transpose of given matrix:");
        for (int i=0;i<row2;i++){
            for (int j=0;j<column2;j++){
                System.out.print(mat2[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
