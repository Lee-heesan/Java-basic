package java_mid_1.lang.object.test;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100,30);
        Rectangle rect2 = new Rectangle(100,30);
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1==rect2);
        System.out.println(rect1.equals(rect2));

    }
}
