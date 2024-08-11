public class d_typecasting {
    public static void main(String[] args) {
        /*
        Typecasting:
        2 types :
            Automatically by JVM : Implicit
            Forcefully by Programmer : Explicit
         */
        //Implicit
        int a = 32;
        double b = a;
        System.out.println(a+" "+b);

        //Explicit
        double c = 45.78;
        int d = (int) c;
        System.out.println(c+" "+d);

        //non-primitive to primitive
        float e = 45.66f;
        String f = String.valueOf(e);
        System.out.println(f);
        //likewise
        double g = Double.parseDouble(f);
        int h = (int) Double.parseDouble(f);

        String i = "J";
        char j = i.charAt(0);


    }
}
