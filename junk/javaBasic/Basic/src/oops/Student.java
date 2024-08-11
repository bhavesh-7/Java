package oops;
public class Student {
    //Constructor Overloading
    //NON-PARAMETERIZED Constructor
    public Student(){
        System.out.println("Student Object Created.");
    }
    //PARAMETERIZED Constructor
    public Student(int studentId, String studentName, String studentCity){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentCity=studentCity;
    }
    //data:data members:instance variable
    int studentId;
    String studentName;
    String studentCity;
    //Behaviour:member methods:methods(functions)
    public void study(){
        System.out.println(studentName + " is studying.");
    }
    //Method Overloading, Same Method name, different attributes.
    public void study(double hours){
        System.out.println(studentName + " is studying from "+hours+" hours");
    }
    public void showFullDetails(){
        System.out.println("Name : "+ studentName);
        System.out.println("Id   : "+studentId);
        System.out.println("City : "+studentCity);
    }

}
