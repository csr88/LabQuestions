import java.util.Arrays;
import java.util.Scanner;
public class LabArray27 {
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

        int temp =0;
        for (int i=0;i<count;i++){
            if (arr[i]==1){
                for (int j=count-1;j>=0;j--){
                    if(arr[j]==0){
                        temp = arr[i];
                        arr[i]=arr[j];
                        arr[j] = temp;
                    }
            }
        }
    }
        System.out.println("Resultant array: " + Arrays.toString(arr) );

    }
}