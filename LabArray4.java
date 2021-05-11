import java.util.Scanner;
public class LabArray4 {
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
        int index=0;

        for (int j=0;j<count;j++){
            if (arr[j]==checknum){
                index=j;
            }

        }


        if (index!=0){
            System.out.println("Number " + checknum +" is located in " + index+1 + "th position.");
        }
        else{
            System.out.println("The array doesn't contain the given number.");
        }
    }
}
