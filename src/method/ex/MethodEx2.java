package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        loopMessage("Hello World",5);
    }
    public static void loopMessage(String message, int n){
        for(int i =0; i<n;i++){
            System.out.println(message);
        }
    }
}
