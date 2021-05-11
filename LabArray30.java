import java.util.Arrays;
import java.util.Scanner;

public class LabArray30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of integers; ");
        int count = sc.nextInt();
        System.out.println("Enter the " + count + " integers: ");

        int[] arr = new int[count];
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] arr2 = new int[count];
        int oddcount = 0;
        int evencount = 0;
        int k=0;
        for (int i=0;i<count;i++){
            if (arr[i] % 2 == 0){
                arr2[k] = arr[i];
                evencount++;
                k++;
            }
        }

        for (int i=0;i<count;i++){
            if (arr[i] % 2 != 0){
                arr2[evencount] = arr[i];
                oddcount++;
                evencount++;

            }
        }
        System.out.println("\nResultant Array: " + Arrays.toString(arr2));


    }
}
