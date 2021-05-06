
import java.util.Scanner;
public class LabArray11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of integers: ");
        int count = sc.nextInt();

        int[] arr= new int[count];
        System.out.println("Enter the integers: ");
        for (int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }

        int[] dublicate = new int[count];
        System.out.println("Dublicate array: ");
        for (int i=0;i<count;i++){
            dublicate[i]=arr[i];
            System.out.println(dublicate[i]);
        }


    }

}
