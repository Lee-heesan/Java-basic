package java_mid_1.nested.nested.test;

public class OuterClass3 {
    public void MyMethod(){

        class LocalClass{
            public void hello(){
                System.out.println("LocalClass Hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
