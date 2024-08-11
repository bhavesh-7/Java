package oops;

public class Main {
    public static void main(String[] args) {
//        objectExample();
//        constructorExample();
//        methodOverloadingExample();
//        inheritanceExample();
//        overridingExample();
//        abstraction();
        buildInterface("Bhavesh");

    }

    private static void buildInterface(String name) {
        interfaceClass intfs = new InterfaceSol();
        InterfaceSol ntxInter = new InterfaceSol();

        intfs.someMethod(name);
    }

    static void objectExample(){
        //now creating object of student
        Student st1 = new Student();
        st1.studentName="Bhavesh";
        st1.studentId=1000011;
        st1.studentCity="Kalyan";
        st1.study();
        st1.showFullDetails();
    }
    static void constructorExample(){
        Student st1 = new Student(45,"Bhavesh","Mumbai");
        st1.study();
        st1.showFullDetails();
    }
    static void methodOverloadingExample(){
        Student st1 = new Student(43,"Bhavesh","Thane");
        st1.study();
        st1.study(2.4);
        st1.showFullDetails();
    }

    static void inheritanceExample(){
        Dog dog1 = new Dog("Labrador","White","Johhny",8);
        dog1.eat();
        dog1.walk();
        dog1.dogDetails();
    }
    static void overridingExample(){
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.Sound();
        dog.Sound();
    }
    static void abstraction(){
        abstractSol sol1 = new abstractSol();
        sol1.justAMtehod();
        sol1.aAbstractMethod();
    }
}
