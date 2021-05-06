import java.util.Scanner;
public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.nextLine();
        int length = str.length();
        char ch;
        int vowel=0;

        for (int i=0;i<length;i++){
            ch = str.charAt(i);

            if (ch == 'a' || ch =='e' ||ch =='i' || ch=='o' || ch=='u' ){
                vowel++;
            }

            else if (ch == 'A' || ch =='E' ||ch =='I' || ch=='O' || ch=='U' ){
                vowel++;
            }

        }
        System.out.println("There are " + vowel + " vowels in the word " + str + ".");


    }
}
