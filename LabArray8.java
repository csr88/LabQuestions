import java.util.Scanner;

class LabArray8 {
    public static void main(String[] args) {
        int num, i, j, temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers to sort:");
        num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter " + num + " integers: ");

        for (i = 0; i < num; i++)
            array[i] = input.nextInt();

        for (i = 0; i < num; i++) {
            for (j = i + 1; j < num; j++) {
                if (array[i] > array[j]) { //to make descending array[i] < array[j]
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Sorted list of integers:");

        for (i = 0; i < num; i++) {
            System.out.println(array[i]);
        }
    }
}