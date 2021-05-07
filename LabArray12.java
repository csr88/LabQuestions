import java.util.Scanner;
public class LabArray12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of integers in first array: ");
        int count1 = sc.nextInt();
        System.out.println("Enter the total number of integers in second array: ");
        int count2 = sc.nextInt();

        int[] arr1 = new int[count1];
        System.out.println("Enter the elements of first array");
        for (int i=0;i<count1;i++){
            arr1[i]= sc.nextInt();
        }

        int[] arr2 = new int[count1];
        System.out.println("Enter the elements of second array");
        for (int i=0;i<count1;i++){
            arr2[i]= sc.nextInt();
        }

        System.out.println("Common elements between array1 and array2 are: ");
        for (int i=0;i<count1;i++){
            for(int j=0;j<count2;j++){
                if (arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }


    }
}
