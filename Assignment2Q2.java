import jdk.jfr.Percentage;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment2Q2 {
    public static void main(String[] args) throws FileNotFoundException {
        double total=0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the marks obtained in 5 subjects: ");
        for (int i=0;i<5;i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        System.out.println("");

        System.out.println("Total marks obtained: " + total);
        double percentage = ((total/500)*100);

        DecimalFormat value = new DecimalFormat("#.#");
        //Double.parseDouble sends the string as double
        percentage = Double.parseDouble(value.format(percentage));

        System.out.println("percentage score: " + percentage + "%");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of student: ");
        String name = scanner.nextLine();



        PrintWriter outF = new PrintWriter("/home/shishir/IdeaProjects/Shishir/Javalab 10 qsns/src/score.txt");
        outF.printf("########### RESULT ###########\n");
        outF.printf("Name: " + name + "\n");

        if (percentage<29.9){
            System.out.println("Division: FAIL");
            outF.printf("Division: fail");
        }
        else if (percentage >=30 && percentage<60){
            System.out.println("Division: SECOND");
            outF.printf("Division: second ");

        }
        else if (percentage >=60 && percentage<80){
            System.out.println("Division: FIRST");
            outF.printf("Division: first");

        }
        else{
            System.out.println("Division: DISTINCTION");
            outF.printf("Division: distinction");
        }

        outF.close();


    }
}
