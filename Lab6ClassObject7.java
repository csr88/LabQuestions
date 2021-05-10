import java.util.Scanner;

public class Lab6ClassObject7 {

    String bookname,authorname;
    int bookcode,price;

    void print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of book: ");
        bookname = sc.nextLine();

        System.out.println("Enter the name of author: ");
        authorname = sc.nextLine();

        System.out.println("Enter bookcode: ");
        bookcode = sc.nextInt();

        System.out.println("Enter the price of book: ");
        price = sc.nextInt();

    }

    void bookname(){
        System.out.println("Bookname: " + bookname);
    }
    void authorname(){
        System.out.println("Author name: " + authorname);
    }
    void bookcode(){
        System.out.println("Bookcode: " + bookcode);
    }
    void price(){
        System.out.println("Price: "  + price);
    }

    public static void main(String[] args){
        Lab6ClassObject7 b1 = new Lab6ClassObject7();
        b1.print();
        b1.bookname();
        b1.authorname();
        b1.bookcode();
        b1.price();

    }

}
