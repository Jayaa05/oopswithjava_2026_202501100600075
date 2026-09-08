public class Shape {

    // Area of Square
    void area(int a) {
        System.out.println("Area of Square = " + (a * a));
    }

    // Area of Rectangle
    void area(int l, int b) {
        System.out.println("Area of Rectangle = " + (l * b));
    }

    // Area of Circle
    void area(double r) {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }

    public static void main(String[] args) {

        Shape obj = new Shape();

        obj.area(5);          // Square
        obj.area(10, 5);      // Rectangle
        obj.area(7.0);        // Circle
    }
}