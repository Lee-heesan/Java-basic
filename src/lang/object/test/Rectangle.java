package lang.object.test;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return width == rectangle.width && height == rectangle.height;
    }

//    @Override
//    public boolean equals(Object o) {
//        Rectangle rectangle = (Rectangle) o;
//        return width == rectangle.width && height == rectangle.height;
//    }


}
