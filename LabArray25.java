import java.util.Scanner;
public class LabArray25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of integers: ");
        int count = sc.nextInt();
        System.out.println("Enter the " + count + " integers: ");

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        int counting=0;
        for (int i=0;i<count;i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] > arr[j]) {
                    counting++;
                }
            }
            if (counting == count - (i+1)) {
                System.out.println(arr[i] + " is a leader.");
            }
            counting=0;
        }
    }
}