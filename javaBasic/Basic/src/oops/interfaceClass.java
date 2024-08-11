package oops;

public interface interfaceClass {

    int i = 34;
    void someMethod(String name);

}


class InterfaceSol implements interfaceClass{
    @Override
    public void someMethod(String name) {
        System.out.println("Your name is donyikes-X-"+name+" And your age is "+ i);
    }
}