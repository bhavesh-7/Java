public class e_operators {
    public static void main(String[] args) {
        //Arithmetic : +, -, *, /, %, ++, --
        //Assignment : =, +=, -=, *=. /=
        //Comparison : ==, <, >, =<, =>, !=
        //Logical : &&, ||, !

        int a=14,b=2;
        System.out.println(a); //14
        System.out.println(b); //2

        //Arithmetic
        System.out.println(a+b); //16
        System.out.println(a-b); //12
        System.out.println(a*b); //28
        System.out.println(a/b); //7
        System.out.println(a%b); //0

        //Assignment
        a=56; b=43;
        System.out.println(a); //56
        System.out.println(b); //43
        a+=4;
        System.out.println(a); //60
        b-=3;
        System.out.println(b); //40
        a*=2;
        System.out.println(a); //120
        b/=4;
        System.out.println(b); //10

        //comparison (returns bool)

        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        System.out.println(a>b); //true
        System.out.println(a<b); //false
        System.out.println(a<=b); //false
        System.out.println(a>=b); //true

        //logical (also returns bool)

        System.out.println(a==b && a>b); //false
        System.out.println(a>b || a!=b); //true
        System.out.println(!(a>b)); //false

        //unary op
        //REMEMBER, "a" is equals to 120 now.
        int c = a++;
        System.out.println(c); //120 (a is assigned first then incremented)
        //a = 121
        int d = ++a;
        System.out.println(d); //122 (a is incremented and then assigned)
        //same way works the --x or x--;

    }
}
