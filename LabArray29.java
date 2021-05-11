import java.util.Arrays;
import java.util.Scanner;
public class LabArray29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of integers: ");
        int count = sc.nextInt();
        System.out.println("Enter the " + count + " integers: ");
        int[] arr1 = new int[count];
        int[] arr2 = new int[count];
        for (int i=0;i<count;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr1));

        int temp;
        for (int i=0;i<count;i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr1[i] > arr1[j]) {
                    temp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }

        int max = arr1[count-1];
        arr2[0] = max;
        int k=0;
        for (int j=1;j<count;j++) {
            arr2[j] = arr1[k];
            k++;
        }

        System.out.println("Resultant Array: " + Arrays.toString(arr2));



    }
}
