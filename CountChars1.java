import java.io.*;
import java.util.Scanner;

public class CountChars1 {
    public static void main(String[] args) throws FileNotFoundException{
        int uppercase=0;
        int lowercase=0;
        int others=0;
        int whitespace=0;
        Scanner sc = new Scanner(new File("/home/shishir/IdeaProjects/Shishir/Javalab 10 qsns/src/countchars1.txt"));
        while(sc.hasNext()){
            String x = sc.nextLine();
            System.out.println("The string is: "  + x);
            for (int i=0;i<x.length();i++){
                char ch = x.charAt(i);
                if (ch>='A' && ch<='Z'){
                    uppercase++;
                }
                else if(ch>='a' && ch<='z'){
                    lowercase++;
                }

                else if(ch ==' '){
                    whitespace++;
                }

                else{
                    others++;
                }
            }
        }

        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Others: " + others);
        System.out.println("Whitespace: " + whitespace);

    }
}
