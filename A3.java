import java.util.Scanner;

public class A3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();

        double min = Math.min(Math.min(num1,num2),num3);

        System.out.println("\n\nThe smallest value is: " + min);



    }
}
