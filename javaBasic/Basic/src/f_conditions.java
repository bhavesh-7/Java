public class f_conditions {
    public static void main(String[] args) {
        /*
        Conditions:
        if,
        if, else,
        if, else if, else,
        Nested if,
        switch
         */

        int age = 21;
        if (age >= 18){
            System.out.println("Yay, you can watch A rated movies!");
        }

        if (age <18 && age>12){
            System.out.println("Yay, you can watch U rated movies!");
        }
        else{
            System.out.println("Don't watch TV");
        }

        if(age>18 || age <35){
            System.out.println("You gotta work your way up bro!");
        }
        else if(age>15 && age<18){
            System.out.println("You gotta learn your way up kid!");
        }
        else{
            System.out.println("Just enjoy your life!");
        }

        if (age<40){
            if (age==35){
                System.out.println("Chill bro you'll make it!");
            }
            if (age == 21){
                System.out.println("You have a long way ahead!");
            }
            System.out.println("Keep Going!");
        }
        else{
            System.out.println("Relax, Learn, Enjoy, Repeat!");
        }

        String day = "Sunday";
        day = "Monday";
        switch (day){
            case "Monday":
                System.out.println("You have to study Java!");
                break;
            case "Tuesday":
                System.out.println("You have to walk your dog.");
                break;
            case "Wednesday":
                System.out.println("You have to go to the interview.");
                break;
            case "Thursday":
                System.out.println("You have to do nothing");
                break;
            case "Friday":
                System.out.println("You have a mail to write.");
                break;
            default:
                System.out.println("No task for today!");
        }
    }
}
