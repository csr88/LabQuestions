
public class Qsn10_Dimension {
    private double length, breadth, height,side;

    Qsn10_Dimension(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
    }
    Qsn10_Dimension(double s){

        side =s;
    }
    //showing how to call a constructor to another constructor

    Qsn10_Dimension(Qsn10_Dimension dim){
        System.out.println(dim.length);
        Qsn10_Dimension d3 = new Qsn10_Dimension(dim.length, dim.breadth, dim.height);
        length = d3.length;
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
        Qsn10_Dimension d1 =  new Qsn10_Dimension(6,7,3);
        Qsn10_Dimension d2 =  new Qsn10_Dimension(d1);
        System.out.println(d1.length);
        System.out.println(d2.length);


        System.out.println("Total Volume: " + d1.volume() + " cubic centimeter");
        System.out.println("Total Area: " + d1.area() + " square centimeter");

    }

}
