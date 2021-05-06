public class Qsn9_Dimension {
    private double length, breadth, height,side;

    Qsn9_Dimension(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
    }

    Qsn9_Dimension(){
        length = 10;
        breadth = 20;
        height = 30;
    }

    Qsn9_Dimension(double s){
        super();        /* calls constructor according to its parameter. Here super has no parameter so it will
                        * call default constructor */
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

    private double toparea(){

        return (length*height);
    }
    private double facearea(){
        return (length*breadth);
    }

    private double sidearea()
    {
        return (side*breadth) ;
    }

    public static void main(String[] args){
        Qsn9_Dimension d1 =  new Qsn9_Dimension(2,3,4);
        Qsn9_Dimension d2 =  new Qsn9_Dimension(5);
        System.out.println("Side Area: " + d2.sidearea() + " square centimeter");


        System.out.println("Top Area: " + d1.toparea() +" square centimeter" );
        System.out.println("Face Area: " + d1.facearea() + " square centimeter");
        System.out.println("Total Volume: " + d1.volume() + " cubic centimeter");
        System.out.println("Total Area: " + d1.area() + " square centimeter");

    }

}
