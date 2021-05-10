import java.util.Scanner;
public class LabArray18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers in first array: ");
        int count1 = sc.nextInt();

        int[] arr1 = new int[count1];
        System.out.println("Enter the " + count1 + " integers for first array:");
        for (int i = 0; i < count1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the number of integers in second array: ");
        int count2 = sc.nextInt();

        int[] arr2 = new int[count2];
        System.out.println("Enter the " + count1 + " integers for second array:");
        for (int i = 0; i < count2; i++) {
            arr2[i] = sc.nextInt();
        }

        if (count1 == count2) {
            int num1 = 0, num2 = 0, counting = 0;
            for (int i = 0; i < count1 && num1 == num2; i++) {
                num1 = arr1[i];
                num2 = arr2[i];
                counting++;
            }

            if (counting == count1+1) {
                System.out.println("\nThe given arrays are equal");
            } else {
                System.out.println("\nThe given arrays are not equal");
            }
        }
        else {
            System.out.println("\nThe given arrays are not equal");
        }


    }
}
