
public class Qsn5_ShowDate {
    String date;
    Qsn5_ShowDate(){
        date = "0/0/0";
        System.out.println("Default Date: " + date);
    }

    Qsn5_ShowDate(String datee){
        date = datee;
        System.out.println("Date is: " + date);
    }
    public static void main(String[] args){
        Qsn5_ShowDate d1 = new Qsn5_ShowDate();
        System.out.println("Network Provided date: " + java.time.LocalDate.now());

    }

}
