import java.util.Scanner;
public class LabArray19 {
    public static void main(String[] args) {
        int oddcount=0;
        int evencount=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers:");
        int count = sc.nextInt();

        int[] arr = new int[count];
        System.out.println("Enter the " + count + " integers: ");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0){
                evencount++;
            }
            else {
                oddcount++;
            }
        }

        System.out.println("\nThere are " + evencount + " even numbers in the array.");
        System.out.println("There are " + oddcount + " odd numbers in the array.");




    }
}
