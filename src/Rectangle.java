public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}
