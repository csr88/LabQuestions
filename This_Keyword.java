public class This_Keyword {

    double length;
    double breadth;
    double height;

    public This_Keyword(double length, double breadth, double height){
        //Instance variable hiding

        this.length = length;              //this.length is the instance variable since both instance variable
        this.breadth = breadth;           // and the paramters have the same name so to remove conufusion this used.
        this.height = height;
    }

    double volume(){
        return(length*this.breadth*this.height);
    }

    public static void main(String[] args){
        This_Keyword d1 = new This_Keyword(10,20,30);
        System.out.println(d1.length);
        System.out.println("Volume is: " + d1.volume());
    }
}
