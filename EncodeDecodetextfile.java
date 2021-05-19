import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EncodeDecodetextfile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/home/shishir/IdeaProjects/Shishir/Javalab 10 qsns/src/dataSam5a.txt"));
        int encodingnum = sc.nextInt();
//        System.out.println(encodingnum);
        Scanner scanner = new Scanner(new File("/home/shishir/IdeaProjects/Shishir/Javalab 10 qsns/src/dataSam5b.txt"));
        int linecount = 0;
        String line = null;
        String line1 = null;
        String line2 = null;


        while (scanner.hasNext()) {
            line = scanner.nextLine();
            linecount++;
            if (linecount == 1) {               //how? it must print the first line when the linecount is 0
                line1 = line;
            } else {
                line2 = line;
            }
        }

        System.out.println("Caesar Cipher, decoding message");
        System.out.println("\nthe code is - *" + line1 + "*" );

        char char1;
        int ascii1;
        String decoded1 = null;


        // if out of range + or - 26//there are 26 alphabets //ascii value a=97, z=122

        //for line1
        //ascii value of blank space is 32 and comma is 44
        for (int i = 0; i <= line1.length() - 1; i++) {
            ascii1 = (int) line1.charAt(i);

            if (ascii1 != 32 && ascii1 !=44) {
                ascii1 -= encodingnum;

                if (ascii1 < 97) {
                    ascii1 += 26;
                } else if (ascii1 > 122) {
                    ascii1 -= 26;
                } else {}

                char1 = (char) ascii1;
                decoded1 +=char1;
                ascii1 = 0;
                }
            else {
                char1 = (char) ascii1;
                decoded1 +=char1;
                ascii1 = 0;
            }
            }
        decoded1 =  decoded1.substring(4,decoded1.length());
        System.out.println("decoded is - *" + decoded1 + "*");


        //for line2
        char char2;
        int ascii2;
        String decoded2 = null;

        for (int i = 0; i <= line2.length() - 1; i++) {
            ascii2 = (int) line2.charAt(i);

            //ascii value of space is 32 and comma is 44
            if (ascii2 != 32 && ascii2!=44) {
                ascii2 -= encodingnum;

                if (ascii2 < 97) {
                    ascii2 += 26;
                } else if (ascii2 > 122) {
                    ascii2 -= 26;
                } else {}

                char2 = (char) ascii2;
                decoded2 +=char2;
                ascii2 = 0;
            }
            else {
                char2 = (char) ascii2;
                decoded2 +=char2;
                ascii2 = 0;
            }
        }

        decoded2 =  decoded2.substring(4,decoded2.length());
        System.out.println("\nthe code is - *" + line2 + "*" );
        System.out.println("decoded is - *" + decoded2   + "*\n");

        System.out.println("There were " + linecount + " codes processed.");



        }
    }

