
public class Lab6ClassObject10 {
    private double length, breadth, height,side;

    Lab6ClassObject10(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
    }
    Lab6ClassObject10(double s){

        side =s;
    }
    //showing how to call a constructor to another constructor

    Lab6ClassObject10(Lab6ClassObject10 dim){
        System.out.println(dim.length);
        Lab6ClassObject10 d3 = new Lab6ClassObject10(dim.length, dim.breadth, dim.height);
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
        Lab6ClassObject10 d1 =  new Lab6ClassObject10(6,7,3);
        Lab6ClassObject10 d2 =  new Lab6ClassObject10(d1);
        System.out.println(d1.length);
        System.out.println(d2.length);


        System.out.println("Total Volume: " + d1.volume() + " cubic centimeter");
        System.out.println("Total Area: " + d1.area() + " square centimeter");

    }

}
