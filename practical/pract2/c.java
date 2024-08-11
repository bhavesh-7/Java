import java.util.*;
class c{
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = get.nextInt();
        if (marks>80){
            System.out.println("O grade");
        }else if(marks>70){
            System.out.println("A grade");
        }else if(marks>60){
            System.out.println("B grade");
        }else if(marks>40){
            System.out.println("C grade");
        }else if(marks<40){
            System.out.println("F grade");
        }else{
            System.out.println("Invalid Output Error");
        }
    }
}
