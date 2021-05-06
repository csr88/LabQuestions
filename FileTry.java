// how to read input from file in java

import java.io.*;
import java.util.Scanner;   //input from user

public class FileTry {
    //FileNotFound handles when file is not found so that the
    //program/code runs and stops properly
    public static void main(String[] args) throws FileNotFoundException {
        //this is used to read input from keyboard
        //Scanner sc = new Scanner(System.in);

        //now to read input from input.txt file, also give the entire path
        Scanner sc = new Scanner(new File("/home/shishir/IdeaProjects/Shishir/Javalab 10 qsns/src/input.txt"));
        while (sc.hasNext())
        {
            int x = sc.nextInt();
            if (x%2==0){
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
        sc.close();

    }

}
