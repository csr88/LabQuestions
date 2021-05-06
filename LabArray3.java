import java.util.Scanner;
public class LabArray3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements in array: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("Enter the array elements: ");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to search for:");
        int checknum = sc.nextInt();
        int num = 0;

        for (int i=0; num!=checknum && i<count;i++){
            num = arr[i];
        }

        if (num==checknum){
            System.out.println("The array contains the number " + checknum );
        }
        else{
            System.out.println("The array doesn't contain the given number.");
        }
    }
}
