import java.util.Scanner;
public class A7 {
    public int count(String str){
        int count=0;

        char ch[] = new char[str.length()];

        for (int i=0;i<str.length();i++){
            ch[i] = str.charAt(i);

            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }

        return count;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        A7 wordcount = new A7();
        System.out.println("Number of words = " + wordcount.count(str));




    }
}
