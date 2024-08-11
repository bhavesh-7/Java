import java.util.Scanner;
class a{
    public static void main(String... args){
        int x;
        Scanner get = new Scanner(System.in);
        System.out.print("Enter length of input: ");
        x=get.nextInt();
        int[] a= new int[20];
        int sum,avg;
        sum=0;
        avg=0;
        for(int i=1;i<=x;i++){
            System.out.print("Enter value "+i+" : ");
            a[i]=get.nextInt();
        }
        for(int i=1;i<=x;i++){
            sum=sum+a[i];
        }
        avg=sum/x;
        System.out.println("Sum = "+sum);
        System.out.println("");
        System.out.println("Avg = "+avg);
    }
}
