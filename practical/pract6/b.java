import java.util.*;
abstract class Sum {
int n1, n2, n3;
void take() {
Scanner get = new Scanner(System.in);
System.out.print("Enter First Number: ");
n1 = get.nextInt();
System.out.print("Enter Second Number: ");
n2 = get.nextInt();
System.out.print("Enter Third Number: ");
n3 = get.nextInt();
}
abstract void sumOfTwo();
abstract void sumOfThree();
}
class Addition extends Sum {
int sumA,sumB;
void sumOfTwo() {
sumA = n1 + n2;
System.out.println("Sum of two numbers: " + sumA);
}
void sumOfThree() {
sumB = n1 + n2 + n3;
System.out.println("Sum of three numbers: " +
sumB);
}
}
class b{
public static void main(String... args) {
Addition A = new Addition();
A.take();
A.sumOfTwo();
A.sumOfThree();
}
}
