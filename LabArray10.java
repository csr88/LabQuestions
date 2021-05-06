import java.util.Scanner;
public class LabArray10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of integers: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nInversed Array: ");
        for (int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
