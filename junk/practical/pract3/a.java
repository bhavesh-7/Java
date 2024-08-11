import java.util.*;
class a{
    public static void main(String... args){
        int num,fact=1;
        Scanner get = new Scanner(System.in);
        System.out.print("Enter number: ");
        num=get.nextInt();
        for(int i = num; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
    }
}
