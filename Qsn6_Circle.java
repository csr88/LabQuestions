class Circle{
    int radius,circumference;
    Circle(){
        radius = 4;
        System.out.println("Default Radius= " + radius + " and Circumference = " + 2*(22/7)*radius);
    }

    Circle(int r){
        radius =r;
        System.out.println("Radius= " + radius + " and Circumference = " + 2*(22/7)*radius);
    }

}

public class Qsn6_Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
    }
}
