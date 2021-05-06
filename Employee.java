import java.io.*;
import java.util.Scanner;

public class Employee {
    String name;
    int age;
    double salary;


    Employee(String nam,int ag, int sal){
        name = nam;
        age = ag;
        salary = sal;
    }

    String getName(){
        String n = name;
        return n;
    }

    int getAge(){
        int a = age;
        return a;
    }

    double getSalary(){
        double s = salary;
        return s;
    }

    Employee compSalary(Employee e2value){

        if (this.getSalary()> e2value.getSalary()){
            return this;
        }

        else{
            return e2value;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        PrintWriter outF = new PrintWriter("/home/shishir/IdeaProjects/Shishir/Javalab 10 qsns/src/emp.txt");


        Employee e1 = new Employee("Ram",25,50000);
        Employee e2 = new Employee("Shyam",45,70000);
        Employee compare = e1.compSalary(e2);

        System.out.println(compare.getName() + " has the highest salary");


        outF.printf("Name");
        outF.printf("\tAge");
        outF.printf("\t\tSalary");

        if (e1.getSalary() > e2.getSalary()){
            outF.printf("\n"+e1.getName());
            outF.printf("\t\t"+ e1.getAge());
            outF.printf("\t\t"+ e1.getSalary());
        }

        else{

            outF.printf("\n"+e2.getName());
            outF.printf("\t"+ e2.getAge());
            outF.printf("\t\t"+ e2.getSalary());
        }

//        outF.printf("\n"+e1.getName());
//        outF.printf("\t\t"+ e1.getAge());
//        outF.printf("\t\t"+ e1.getSalary());
//
//        outF.printf("\n"+e2.getName());
//        outF.printf("\t"+ e2.getAge());
//        outF.printf("\t\t"+ e2.getSalary());








        outF.close();
        sc.close();


    }
}
