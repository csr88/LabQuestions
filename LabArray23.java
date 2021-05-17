
import java.util.Arrays;
import java.util.Scanner;
public class LabArray23 {
    public static void main(String[] args) {
        int temp=0;
        int counting=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of integers: ");
        int count = sc.nextInt();

        int[] arr = new int[count];
        System.out.println("Enter the " + count + " integers: ");
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nOriginal Array: " + Arrays.toString(arr));

        int count1=count;

        //counting the number of dublicate numbers to create a new aray of length original - number of dublicates
        //sending all the dublicates to ends of the array

        for (int i=0;i<count;i++){
            for (int j=i+1;j<count;j++){
                if (arr[i]==arr[j]) {
                    counting++;

                    temp = arr[j];
                    arr[count1] = arr[j];
                    arr[j] = arr[count1];
                    count1--;
                }

            }
        }

        int newcount = count-counting;
        int[] arr2 = new int[newcount];
        System.out.println(newcount);

        //removing dublicates which are at the ends of the array
        for (int i=0;i<newcount;i++){
            arr2[i] = arr[i];
        }



        System.out.println("\nResultant Array: " + Arrays.toString(arr2));
        System.out.println("New array length: " + newcount);

//The continue statement is used to skip the rest of the code inside a loop for the current iteration only.
// Loop does not terminate but continues on with the next iteration.
    }
}