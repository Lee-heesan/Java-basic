package java_mid_1.nested;

public class ShowingMain {
    public int value =1;

    class Inner {
        public int value =2;

        void go() {
            int value =3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShowingMain.this.value = " + ShowingMain.this.value);
        }
    }

    public static void main(String [] args){
        ShowingMain main = new ShowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
