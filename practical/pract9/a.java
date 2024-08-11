import java.util.*;
class input{
    static int n1=0,n2=0;
    static void accept(){
        Scanner get=new Scanner(System.in);
        System.out.print("Enter num 1: ");
        n1=get.nextInt();
        System.out.print("Enter num 2: ");
        n2=get.nextInt();
    }
}
class addition extends input{
    static void add(){
        addition x = new addition();
        int a = x.n1+x.n2;
        System.out.println("Addition: "+a);
    }
}
class subtract extends input{
    static void sub(){
        subtract y = new subtract();
        int s = y.n1-y.n2;
        System.out.println("Subtraction: "+s);
    }
}
class a{
    public static void main(String... ags){
        input q = new input();
        addition w = new addition();
        subtract e = new subtract();
        q.accept();
        w.add();
        e.sub();
    }
}
