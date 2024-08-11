import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int num1=myObj.nextInt();
        int num2=myObj.nextInt();
        System.out.println(num1+num2+"\n");
        System.out.println(num1-num2);
        if(num2!=0){
            System.out.println(num1/num2);
        } else {
            System.out.println("ND");
        }
        System.out.println(num1*num2);
        
    }
}
