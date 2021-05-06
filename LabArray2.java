import java.util.Scanner;
public class LabArray2 {
    public static void main(String[] args) {
        int sumarray = 0,summatrix=0;
        double avgarray=0,avgmatrix=0;
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


        for (int i=0;i<count;i++){
            sumarray += arr[i];
        }
        System.out.println("\nArray Sum: " + sumarray);
        avgarray = (float)sumarray / count;
        System.out.println("Array Average: " + avgarray);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                summatrix += mat[i][j];
            }
        }
        int elementmatrix = row * column;
        avgmatrix  = (float)summatrix /elementmatrix;
        System.out.println("Matrix Sum: " + summatrix);
        System.out.println("Matrix Average: " + avgmatrix);

        sc.close();
    }
}
