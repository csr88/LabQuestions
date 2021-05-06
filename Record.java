import java.io.*;
import java.util.Scanner;

public class Record {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("/home/shishir/IdeaProjects/Shishir/Javalab 10 qsns/src/record.txt"));
        PrintWriter out = new PrintWriter(new File("/home/shishir/IdeaProjects/Shishir/Javalab 10 qsns/src/result.txt"));
       out.printf("Name\t\t\tMark1\t\tMark2\t\tMark3\t\tTotal");
        while(sc.hasNext()){
            String line = sc.nextLine();
            System.out.println(line.split(" "));
            String[] arr = line.split(" ");
            //makes a string array where each elements are seperated with spaces
            //the string array looks like jiberish
//                       int total = Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]) +Integer.parseInt(arr[3);
// System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] + ", " );
//            System.out.println("----------------------------");

            int total = Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]) +Integer.parseInt(arr[3]);
            //converted string to int just to find the sum
            out.printf("%s\t\t\t%s\t\t%s\t\t%s\t\t%d",arr[0],arr[1],arr[2],arr[3],total);


        }


    }
}
