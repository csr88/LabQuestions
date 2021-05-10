
public class Lab6ClassObject5 {
    String date;

    Lab6ClassObject5(){
        date = "0/0/0";
        System.out.println("Default Date: " + date);
    }

    Lab6ClassObject5(String datee){
        date = datee;
        System.out.println("Date is: " + date);
    }
    public static void main(String[] args){
        Lab6ClassObject5 d1 = new Lab6ClassObject5();
        System.out.println("Network Provided date: " + java.time.LocalDate.now());

    }

}
