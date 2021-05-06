import java.io.*;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) throws FileNotFoundException{
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        PrintWriter outF = new PrintWriter("/home/shishir/IdeaProjects/Shishir/Javalab 10 qsns/src/fileoutput.txt");
        //create a file named fileouput.txt for storing the sum and outF is just a name
        System.out.println("Enter 5 integers: ");
        for (int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;

        for (int i=0;i<=arr.length-1;i++){
            sum =  sum + arr[i];
        }

        outF.printf("Sum = %d",sum);
        //%d to print integer
        // %f for floating and double
        // %s for string
        //save the output of sum variable and print that using %d
        //saving the file specified in outF object
        outF.close();
        sc.close();



    }
}
