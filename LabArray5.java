import java.util.Scanner;

public class LabArray5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("Enter the array elements: ");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\nCopying the array.....\n");

        int[] arrcopy = new int[count];
        for (int i=0;i<count;i++){
            arrcopy[i] = arr[i];
        }

        System.out.println("Copied Array: ");

        for (int i=0;i<count;i++){
            System.out.println(arrcopy[i]);
        }

    }
}
