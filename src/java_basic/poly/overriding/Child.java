package java_basic.poly.overriding;

public class Child extends Parent{
    public String value = "child";

    @Override
    public void method() {
        System.out.println("Child java_start.method");
    }
}
