public class Qsn8_Dimension {
    private double length, breadth, height,side;

    Qsn8_Dimension(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
    }
    Qsn8_Dimension(double s)
    {
        side =s;

    }

    double volume(){
        double vol = length*breadth*height;
        return vol;
    }

    double area(){
        double area = 2*(length*breadth + breadth*height +height*length );
        return area;
    }


    public static void main(String[] args){
        Qsn8_Dimension d1 =  new Qsn8_Dimension(4,2,7);
        Qsn8_Dimension d2 =  new Qsn8_Dimension(10);
        System.out.println("Total Volume: " + d1.volume() + " cubic centimeter");
        System.out.println("Total Area: " + d1.area() + " square centimeter");
        System.out.println("Side = " + d2.side);

    }

}
