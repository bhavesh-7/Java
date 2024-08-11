import java.util.*;
class a{
    static double pi=3.14;
    static void area(double radius){
        System.out.println("Area Of Circle: "+radius*radius*pi);
    }
    static void area(double length, double width){
        System.out.println("Area Of Rectangle: "+length*width);
    }
    static void area(float height, float base){
        System.out.println("Area Of Triangle: "+ 0.5*height*base);
    }
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        double r,l,w;
        float h,b;
        System.out.print("Enter Radius of Circle: ");
        r=get.nextDouble();
        System.out.print("Enter Length of Rectangle: ");
        l=get.nextDouble();
        System.out.print("Enter Width of Rectangle: ");
        w=get.nextDouble();
        System.out.print("Enter Height of Triangle: ");
        h=get.nextFloat();
        System.out.print("Enter Base of Triangle: ");
        b=get.nextFloat();
        area(r);
        area(l,w);
        area(h,b);
    }
}
