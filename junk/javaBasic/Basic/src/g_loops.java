public class g_loops {
    public static void main(String[] args) {
        /*
        Loops:
        for,
        while,
        do-while,
        enhanced for,
        break statement, continue statement
         */

        //let's print even number from 1 to 20
        for (int i = 1; i<=20; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //let's print whole numbers till 10
        int i = 0;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //remember i value is 11
        //let's print numbers till 10
        //do while loop executes the code block atleast one time even if condition is false; (while loop would have never run)
        do{
            System.out.println(i); //11
            i++;
        }while(i<=10); //false

        //enhanced for- array.
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        for(int number : numbers){
            System.out.print(number+" ");
        }
        System.out.println();
        //continue break;
        //print even number till 20, but not the number 10
        for (int j = 1; j <=20; j++){
            if (j==10)
                continue;
            if (j%2==0){
                System.out.print(j + " ");
            }
        }
        System.out.println();
        //Originally print even number till 100 but if asked number is x then print only till x;
        int asked = 30;
        for (int k = 1; k<=100; k++){
            if (k%2==0){
                System.out.print(k+" ");
            }
            if (k==asked)
                break;
        }
    }
}
