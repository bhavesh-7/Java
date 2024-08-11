import java.util.*;
class b{
    int price;
    String athnm,nm;
    void get(){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        nm=get.nextLine();
        System.out.print("Enter Author Name: ");
        athnm=get.nextLine();
        System.out.print("Enter Book Price: ");
        price=get.nextInt();
    }
    void show(){
        System.out.println("Book Name   : "+nm);
        System.out.println("Author Name : "+athnm);
        System.out.println("Book Price  : "+price);
    }
    public static void main(String... args){
        b x = new b();
        x.get();
        x.show();
    }
}
