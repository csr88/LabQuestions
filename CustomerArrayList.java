
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class CustomerArrayList
{
    String name;
    double purchase_amount;
    double discountAmount;

    CustomerArrayList(String name, double purchase_amount){
        this.name = name;
        this.purchase_amount = purchase_amount;
    }

    String getname()
    {
        return name;
    }

    double getPurchase_amount(){
        return purchase_amount;
    }
    double getDiscountAmount(double discountAmount){
        this.discountAmount = discountAmount;
        return discountAmount;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList <CustomerArrayList> list  = new ArrayList<CustomerArrayList>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers you want to add: ");
        int count = sc.nextInt();
        System.out.println("Customer : "+count);
        String names;
        double pa;
        for(int i = 0;i<count;i++){
            System.out.println("Enter name: ");
            names = sc.next();
            System.out.println("Enter purchase amount: ");
            pa = sc.nextDouble();

            list.add(new CustomerArrayList(names,pa));
        }
        PrintWriter outF = new PrintWriter("/home/shishir/IdeaProjects/Shishir/Javalab 10 qsns/src/CustomerArrayList.txt");
        outF.printf("ID");
        outF.printf("\tName");
        outF.printf("\t\tPurchase Amount");
        outF.printf("\t\t\tTotal Payable\n");

        System.out.println("List of customers");
        for(int i = 0;i<count;i++){
            System.out.println(list.get(i).name+"==="+list.get(i).purchase_amount);
//            outF.printf((i+1) + "\t" + list.get(i).name + "\t\t\t" + list.get(i).purchase_amount + "\n" );

//            outF.printf("\t"+list.get(i).name);
//            outF.printf("\t\t\t"+ list.get(i).purchase_amount + "\n");
        }

        //getting the discount
        double discountpercentage;
        double payableamount = 0;
        double totalamount =0;

        for(int i=0;i<count;i++){
            outF.printf((i+1) + "\t" + list.get(i).name + "\t\t\t\t\t" + list.get(i).purchase_amount  );

            if(list.get(i).purchase_amount<=1000){
                discountpercentage =0.05;
                list.get(i).discountAmount = discountpercentage * list.get(i).purchase_amount;
                payableamount = list.get(i).purchase_amount - list.get(i).discountAmount;
                outF.printf("\t\t\t"+ payableamount + "\n");
                totalamount += payableamount;

            }
            else{
                discountpercentage=0.10;
                list.get(i).discountAmount = discountpercentage * list.get(i).purchase_amount;
                payableamount = list.get(i).purchase_amount - list.get(i).discountAmount;
                outF.printf("\t\t\t"+ payableamount + "\n");
                totalamount += payableamount;
            }
        }
        outF.printf("\n.\n.");
        outF.printf("\n===================================================================");
        outF.printf("\nTotal Amount:");
        outF.printf("\t\t\t\t\t\t\t\tRs." + payableamount );




        outF.close();
        sc.close();
        }


}