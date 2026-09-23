abstract class Shape {

    abstract void calculateArea();
}

class Circle extends Shape {

    double radius = 5;

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle extends Shape {

    double length = 10;
    double width = 5;

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class AbstractDemo {

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.calculateArea();
        r.calculateArea();
    }
}