import java.util.*;
class room{
    int rno,rarea,rtype;
    boolean ac;
    void accept(){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter Room Number: ");
        rno=get.nextInt();
        System.out.print("Enter Room Area: ");
        rarea=get.nextInt();
        System.out.print("Enter Room Type: ");
        rtype=get.nextInt();
        System.out.print("Air Conditioned?: ");
        ac=get.nextBoolean();
    }
    void display(){
    System.out.println("Room Number          : "+rno);
    System.out.println("Room Area            : "+rarea+" sq.ft");
    System.out.println("Room Type            : "+rtype+" bhk");
    System.out.println("Room Air Conditioned : "+ac);    
    }
}
class a{
    public static void main(String... args){
        room r1 = new room();
        r1.accept();
        r1.display();
    }
}
