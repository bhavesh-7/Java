import java.util.*;
class a{
    int l,b;
    void get(){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        l=get.nextInt();
        System.out.print("Enter Breath of Rectangle: ");
        b=get.nextInt();
    }
    void area(){
        System.out.println("Length   : "+l);
        System.out.println("Breath   : "+b);
        System.out.println("Area     : "+l*b);
    }
    public static void main(String... args){
        a x = new a();
        x.get();
        x.area();
    }
}
