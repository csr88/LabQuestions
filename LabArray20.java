import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
public class LabArray20 {
    public static void main(String[] args) {
        int temp;
        double sum=0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of integers: ");
        int count = sc.nextInt();

        int[] arr = new int[count];
        System.out.println("Enter the " + count + " integers: ");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }

        //sorting in ascending order
        for (int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[j] = arr[i];
                    arr[j] = temp;
                } } }

        for (int i=1;i<count-1;i++){
            sum+=arr[i];
        }

        System.out.println("Average of the array excluding the minimum and maximum number: " + sum/(count-2));

    }
}
