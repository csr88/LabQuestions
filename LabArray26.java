import java.util.Scanner;
public class LabArray26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of integers: ");
        int count = sc.nextInt();
        System.out.println("Enter the " + count + " integers: ");

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        int temp=0;
        //sorting in ascending order
        for (int i=0;i<count;i++){
            for (int j=i+1;j<count;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nSmallest integer: " + arr[0]);
        System.out.println("Second smallest integer: " + arr[1]);


    }
}