import java.util.Arrays;
import java.util.Scanner;

public class Assignment2Q1 {
    public static void main(String[] args){
        int sum=0,temp=0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i=0;i<5;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        System.out.println("Sum of all numbers: " + sum);
        System.out.println("Before sorting:");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+ "\t");
        }

        //sorting array
        for (int i=0;i<5;i++){
            for (int j=i+1;j<5;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nAfter sorting:");
        for(int i=0;i<5;i++){
            System.out.print(arr[i] + "\t");
        }


    }

}
