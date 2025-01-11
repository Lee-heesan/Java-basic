package nested.nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        Hello hello = new Hello(){
            @Override
            public void Hello(){
                System.out.println("AnonymousMain hello");
            }
        };
        hello.Hello();
    }
}
