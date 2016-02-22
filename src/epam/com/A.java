package epam.com;

/**
 * Created by Любовь on 22.02.2016.
 */
public class A {


    private int length1;
    private int length2;
    private int length3;
    private double radius;
    private final double p = 3.1415926;

    public void calcSquare(int length1,int length2,int length3){

        int s = (length1+length2+length3)/2;
        System.out.println("The square of the triangle is " + s);

    }
    public void calcSquare(int length1, int length2){

        int s = length1*length2;
        System.out.println("The square of the rectangle is " + s );

    }
    public void calcSquare(int length1){
        int s = length1*length1;
        System.out.println("The square of the foursquare is " + s);
    }

    public void calcSquare(double radius){
        double s = numberP(3.1415926)*(radius*radius);
        System.out.println("The square of the circle is " + s);
    }

    public double numberP(final double p){

        return p;
    }
}
