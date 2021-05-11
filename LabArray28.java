import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class LabArray28 {

    static void rotate(int[] array){
        int x = array[array.length-1], i;
        for (i = array.length-1; i > 0; i--)
            array[i] = array[i-1];
        array[0] = x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of integers: ");
        int count = sc.nextInt();
        System.out.println("Enter the " + count + " integers: ");

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));

        rotate(arr);

        System.out.println("Rotated Array: " + Arrays.toString(arr));



    }
}

