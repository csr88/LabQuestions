import java.util.Scanner;
class Sum{
    public int integer,remainder,sum;

    int total(){
        while (integer>0){
            remainder = integer%10;
            sum+=remainder;
        } return sum;
    }
}

public class Qsn8_Sum {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int integer = sc.nextInt();
        System.out.println(s1.total());
    }

}
