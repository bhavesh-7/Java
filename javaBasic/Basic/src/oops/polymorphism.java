package oops;

public class polymorphism  {
    public static void main(String[] args) {
        polymorphism obj = new polymorphism();
        obj.read();
        read("Bhavesh");
        obj.read(23,"whtup my lady");
        overridingClass();
    }
    //this is method overloading to do polymorphism
    public void read(){
        System.out.println("I read noting");
    }
    private void read(int number, String text){
        System.out.println("I read "+number+" with "+text);
    }
    public static void read(String name){
        System.out.println("I read "+name);
    }
    static void overridingClass(){
        Vehicle obj = new Vehicle();
        obj.sound();
        Car obj2 = new Car();
        obj2.sound();
    }
}

//another way is to do method overriding and for that we need inheritance;

class Vehicle {
    protected Vehicle() {
        System.out.println("This is the Vehicle class!");
    }
    void sound() {
        System.out.println("Vehicle makes types of sound!");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("This is the Car class!");
    }

    @Override
    void sound() {
        System.out.println("The car makes the Vroom Vroom sound!");
    }
}

