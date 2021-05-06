
import java.util.Scanner;
public class LabArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in 1d array: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("Enter the elements for 1d array: ");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }
//        sc.next();          //to remove the blank space of nextInt()


        System.out.println("Enter the number of rows in 2d matrix: ");
        int row = sc.nextInt();

        System.out.println("Enter the number of columns in 2d matrix: ");
        int column = sc.nextInt();

        int[][] mat = new int[row][column];

        System.out.println("Enter the elements for 2d array");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                mat[i][j]= sc.nextInt();
            }
        }


        System.out.println("\n1D Array elements: ");
        for (int i=0;i<count;i++){
            System.out.println(arr[i]);
        }

        System.out.println("\n2D Array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
