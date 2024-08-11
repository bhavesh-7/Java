import java.util.*;
abstract class Calculator{
    int n1, n2;
    void accept(){
    Scanner get = new Scanner(System.in);
    System.out.print("Enter First Number: ");
    n1 = get.nextInt();
    System.out.print("Enter Second Number: ");
    n2 = get.nextInt();
    }
    abstract void calc();
}
class Addition extends Calculator{
    int add;
    void calc(){
    add = n1 + n2;
    System.out.println("Sum: " + add);
    }
}
class Subtraction extends Calculator{
    int sub;
    void calc(){
    sub = n1 - n2;
    System.out.println("Difference: " + sub);
    }
}
class a{
    public static void main(String... args) {
    Addition A = new Addition();
    System.out.println("Addition: \n");
    A.accept();
    A.calc();
    Subtraction S = new Subtraction();
    System.out.println("Subtraction: \n");
    S.accept();
    S.calc();
    }
}
