import java.util.Scanner;

public class A5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int length = str.length();
        int position = length/2;

        if (length%2==0){
            System.out.println("Middle String: " + str.substring(position-1,position+1));
        }

        else{
            System.out.println("Middle String: " + str.charAt(position));
        }

    }
}