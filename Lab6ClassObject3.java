import java.util.Scanner;
class Details{
    String acname, actype;
    int acnumber, balance;
    Scanner sc = new Scanner(System.in);

    /*
    Details(){
        acname = "shishir";
        actype = "savings";
        acnumber = 123456789;
        balance = 350000;
    }
     */

    Details(String name, String atype, int anum, int bal ){
        acname = name;
        actype = atype;
        acnumber = anum;
        balance = bal;
    }

    void display(){
        System.out.println("Name: " + acname + "\n" + "Balance: Rs." + balance);
    }


    public int checkbalance(){
        System.out.println("Your current balance is: Rs." + balance);
        return balance;
    }

    void withdraw(){
        int b = checkbalance();
        System.out.println("Enter withdrawl amount: ");
        int withdraw = sc.nextInt();
        if (withdraw>b){
            System.out.println("You don't have enough balance");
        }
        else {
            System.out.println("Rs." + withdraw + " has been deducted from your account");
            balance = balance - withdraw;
            System.out.println("Your remaining balance is Rs." + (balance));
        }
    }

    void deposit(){
        System.out.println("Enter the deposit amount: ");
        int deposit = sc.nextInt();
        System.out.println("Rs." + deposit + " has been added to your bank account");
        balance =  balance + deposit;
        System.out.println("You current balance is: Rs." + balance );
    }
}

public class Lab6ClassObject3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter you name: ");
        String n = sc.nextLine();

        System.out.println("Enter you account type: ");
        String at = sc.nextLine();

        System.out.println("Enter you account number: ");
        int an = sc.nextInt();

        System.out.println("Enter your balance: ");
        int b = sc.nextInt();

        Details d1 = new Details(n,at,an,b);

        //d1.deposit();
        d1.withdraw();
        //d1.checkbalance();


    }

}
