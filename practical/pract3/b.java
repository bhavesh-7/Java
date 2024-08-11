import java.util.*;
class b{
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = get.nextInt();
        for(int i=1; i<=num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
