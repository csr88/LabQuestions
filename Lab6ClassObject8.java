public class Lab6ClassObject8 {
    private double length, breadth, height,side;

    Lab6ClassObject8(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
    }
    Lab6ClassObject8(double s)
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
        Lab6ClassObject8 d1 =  new Lab6ClassObject8(4,2,7);
        Lab6ClassObject8 d2 =  new Lab6ClassObject8(10);
        System.out.println("Total Volume: " + d1.volume() + " cubic centimeter");
        System.out.println("Total Area: " + d1.area() + " square centimeter");
        System.out.println("Side = " + d2.side);

    }

}
