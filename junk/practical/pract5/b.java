import java.util.*;
class b{
    Scanner get = new Scanner(System.in);
    int accNum,amt=0;
    double balance=0;
    String name;
    void getData(){
        System.out.print("Enter Account Holder Name: ");
        name=get.nextLine();
        System.out.print("Enter Account Number: ");
        accNum=get.nextInt();
        System.out.print("Enter Account Balance: ");
        balance=get.nextDouble();
    }
    void debit(){
        System.out.print("Enter required Amount: ");
        amt=get.nextInt();
        if(amt<balance){
            balance-=amt;
            System.out.println("Ammount "+amt+" deducted.\nCurrent Balance : "+balance);
        }else{
            System.out.println("You don\'t have required amount.");
        }
    }
    void credit(){
        System.out.print("Enter ammount to credit: ");
        amt=get.nextInt();
        balance+=amt;
        System.out.println("Amount "+amt+" credited.\nCurrent Balance : "+balance);
    }
    public static void main(String... args){
        Scanner get = new Scanner(System.in);
        int x;
        b obj = new b();
        obj.getData();
        while(true){
        System.out.print("Choose an option:\n1.Credit\n2.Debit\n3.exit\n---> ");
        x=get.nextInt();
        switch(x){
            case 1:
                obj.credit();
                break;
            case 2:
                obj.debit();
                break;
            case 3:
                System.exit(0);
                break;
        }
        }
    }
}
