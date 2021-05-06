public class SortAsc{
    String name;
    int age;
    int marks1;
    int marks2;
    int marks3;
    int maximum;
    int minimum;
    int average;

    SortAsc(String nam, int ag, int m1, int m2, int m3){
        name = nam;
        age = ag;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void am(){
        minimum = Math.min(Math.min(marks1,marks2),marks3);
        average = (marks1+marks2+marks3)/3;
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + minimum);
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        am();

    }

    public static void main(String[] args) {
        SortAsc d1 = new SortAsc("shishir",19,80,75,58);
        d1.am();
        d1.display();

    }
}