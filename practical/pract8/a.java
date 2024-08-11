import java.util.*;
interface student{
    void grade();
    void attandence();
}

class pg implements student{
    Scanner get = new Scanner(System.in);
    int m,a;
    public pg(){
        System.out.print("Enter Marks: ");
        m=get.nextInt();
        System.out.print("Enter Attandence: ");
        a=get.nextInt();
    }
    public void grade(){
        if(m>80){
            System.out.println("O grade.");
        }else if(m>70){
            System.out.println("A grade.");
        }else if(m>60){
            System.out.println("B grade.");
        }else if(m>40){
            System.out.println("C grade.");
        }else if(m<40){
            System.out.println("F grade.");
        }else{
            System.out.println("Something went wrong, try again.");
        }
    }
    public void attandence(){
        System.out.println("Your Attandence is "+a+" of 250");
    }
}
class ug implements student{
    Scanner get = new Scanner(System.in);
    int m,a;
    public ug(){
        System.out.print("Enter Marks: ");
        m=get.nextInt();
        System.out.print("Enter Attandence: ");
        a=get.nextInt();
    }
    public void grade(){
        if(m>80){
            System.out.println("O grade.");
        }else if(m>70){
            System.out.println("A grade.");
        }else if(m>60){
            System.out.println("B grade.");
        }else if(m>40){
            System.out.println("C grade.");
        }else if(m<40){
            System.out.println("F grade.");
        }else{
            System.out.println("Something went wrong, try again.");
        }
    }
    public void attandence(){
        System.out.println("Your Attandence is "+a+" of 250");
    }
}
class a{
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        System.out.println("For UG Student: \n");
        ug xx = new ug();
        System.out.println("For PG Student: \n");
        pg yy = new pg();
        while(true){
        System.out.print("Enter your choice:\n1.UG Students\n2.PG Students\n3.Quit\n---> ");
        int x = get.nextInt();
        switch(x){
            case 1:
                xx.grade();
                xx.attandence();
                break;
            case 2:
                yy.grade();
                yy.attandence();
                break;
            case 3:
                System.out.println("Quitting.....");
                System.exit(0);
                break;
            default:
                System.out.println("Error Occured. Try again or Quit");
                break;
        }
        }
    }
}
