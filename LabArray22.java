import java.util.Scanner;

public class LabArray22 {
    public static void main(String[] args){
        int num1 = 0;
        int num2=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int count = sc.nextInt();

        int[] arr = new int[count];
        System.out.println("Enter the " + count + " integers: ");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
            if (arr[i]==65){
                num1 = arr[i];
                System.out.println("65 is in the array");
            }
            else if(arr[i]==77){
                num2 = arr[i];
                System.out.println("77 is in the array");
            }
        }


        if (num1!=65 && num2!=-77){
            System.out.println("Both 65 and 77 are not in the array");
        }
    }
}
