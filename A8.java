import java.util.Scanner;

public class A8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int num = sc.nextInt();
        int remainder = 0;
        int sum=0;

        while (num!=0){
            remainder = num % 10;
            sum += remainder;
            num/=10;
        }
        System.out.println("Sum= " + sum);

    }
}
