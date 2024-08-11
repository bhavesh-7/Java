package oops;

public class Animal {
    String color;
    int age;
    int legs;
    String name;
    String type;
    public Animal(){
        this("Black",1,4,"Animal","Animal");
    }
    public Animal(String color, int age, int legs, String name,String type){
        this.type=type;
        this.color=color;
        this.age=age;
        this.legs=legs;
        this.name=name;
    }
    void Sound(){
        System.out.println("Animal make sound!");
    }
    public void eat(){
        System.out.println(name + " eats!");
    }
    public void walk(){
        System.out.println(name + " Walks!");
    }
    public void animalDetails(){
        System.out.println("Type    = " + type);
        System.out.println("Age     = " + age);
        System.out.println("Name    = " + name);
        System.out.println("Color   = " + color);
        System.out.println("Legs    = " + legs);
    }
}
//single inheritance.
class Dog extends Animal{
    String breed;
    public Dog(){
        this("Dog");
        super.type = "Dog";
    }
    //method overriding
    @Override
    void Sound() {
        System.out.println("Dog Barks");
    }

    public Dog(String breed){
        this.breed=breed;
        super.type = "Dog";
    }
    public Dog(String breed, String color, String name, int age){
        this.breed = breed;
        super.name = name;
        super.age = age;
        super.color=color;
        super.type = "Dog";
    }
    public void dogDetails(){
        System.out.println("---------Dog Details---------");
        super.animalDetails();
        System.out.println("Breed   = " + breed);
    }
}

