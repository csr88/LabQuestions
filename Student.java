import java.util.Scanner;

public class Student {

    String name;
    double mark1;double mark2;double mark3;double total;double percent;

    public Student(String nam, double m1, double m2, double m3){
        name = nam;mark1= m1;mark2 = m2;mark3 = m3;
    }

    double getTotal(){
        total = mark1 + mark2 + mark3;
        return total;
    }

    double getPercentage(double total){
        percent = (total / 300) * 100;
        return percent;
    }

    void display(){
        double total = getTotal();
        double percent = getPercentage(total);

        System.out.println("Name:" + name);
        System.out.println("Total mark : " + total);
        System.out.println("Percentage: " + percent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and marks: ");
        String n = sc.nextLine();
        int ma = sc.nextInt();
        int mb = sc.nextInt();
        int mc = sc.nextInt();

        Student d1 = new Student(n, ma, mb, mc);
//      d1.getPercentage(d1.getTotal());

        d1.display();
    }
}
