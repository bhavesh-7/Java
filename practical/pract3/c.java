import java.util.*;
class c{
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = get.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
