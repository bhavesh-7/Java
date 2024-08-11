import java.util.*;
class b{
    public static void main(String... args){
        Scanner get=new Scanner(System.in);
        int num,flag=0,n;
        System.out.print("Enter number: ");
        num=get.nextInt();
        n=num/2;
        if(num==0 || num==1){
            System.out.println(num+" is not a prime number");
            System.exit(0);
        }
        for(int i=2;i<=n;i++){
            if(num%i==0){
                System.out.println(num+" is not a prime number");
                flag =1;
                break;
            }
        }
        if(flag==0){
            System.out.println(num+" is a prime number");
        }
    }
}
