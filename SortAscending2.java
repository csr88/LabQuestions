import java.util.Scanner;
public class SortAscending2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp,sum=0;

        int arr[] = new int[5];
        System.out.println("Enter five numbers: ");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Sorting:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+"\t");;
        }


        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nAfter sorting: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+"\t");
            sum += arr[i];
        }

        System.out.println("\nTotal Sum= " + sum );


    }
}
