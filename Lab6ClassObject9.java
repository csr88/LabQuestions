public class Lab6ClassObject9 {
    private double length, breadth, height,side;

    Lab6ClassObject9(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
    }

    Lab6ClassObject9(){
        length = 10;
        breadth = 20;
        height = 30;
    }

    Lab6ClassObject9(double s){
                // Super calls constructor according to its parameter. Here super has no parameter so it will call default constructor
        super();
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
        Lab6ClassObject9 d1 =  new Lab6ClassObject9(2,3,4);
        Lab6ClassObject9 d2 =  new Lab6ClassObject9(5);

        System.out.println("Side Area: " + d2.sidearea() + " square centimeter");

//
//        System.out.println("Top Area: " + d1.toparea() +" square centimeter" );
//        System.out.println("Face Area: " + d1.facearea() + " square centimeter");
//        System.out.println("Total Volume: " + d1.volume() + " cubic centimeter");
//        System.out.println("Total Area: " + d1.area() + " square centimeter");

        System.out.println("Side Area: " + d2.breadth + d2.height + d2.length + d2.side);

    }

}
