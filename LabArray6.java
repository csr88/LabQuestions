import java.util.Scanner;
public class LabArray6 {

    public static int getMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for(int i=1;i < numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        System.out.println("Enter the array elements: ");
        for(int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }

        int max = getMaxValue(arr);
        int min = getMinValue(arr);

        System.out.println("\nMaximum value:  " + max);
        System.out.println("Minimum value: " + min);








    }
}
