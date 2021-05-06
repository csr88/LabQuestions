    class DetailsStudent{
        String name;
        int age, marks1,marks2,marks3, maximum, average,min;

        DetailsStudent(String nam, int ag, int m1, int m2, int m3){
            name = nam;
            age = ag;
            marks1 = m1;
            marks2 = m2;
            marks3 = m3;
        }

        void averagenum(){
            average = (marks1+marks2+marks3)/3;
            System.out.println("\nAverage Marks: " + average);
        }

        void minimumnum(){
            min = Math.min(Math.min(marks1,marks2),marks3);
            System.out.println("\nMinimum: " + min);
        }

        void maximumnum(){
            maximum = Math.max(Math.max(marks1,marks2),marks3);
            System.out.println("\nMaximum: " + maximum);
        }

        void display(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Marks in 1st subject: " + marks1);
            System.out.println("Marks in 2nd subject: " + marks2);
            System.out.println("Marks in 3rd subject: " + marks3);
    //       System.out.println("Average Marks: " + average);
    //        System.out.println("Minimum: " + min);
    //        System.out.println("Maximum: " + maximum);
            maximumnum();
            minimumnum();
            averagenum();

        }

    }


    public class Qsn4_Student {
        public static void main(String[] args){

            DetailsStudent d1 = new DetailsStudent("shishir",19,50,70,80);
    //        d1.minimumnum();
    //        d1.averagenum();
            d1.maximumnum();
            d1.display();



        }
    }
