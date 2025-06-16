abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base,double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 1/2 * base * height;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        shape[0] = new Rectangle(12.1,23.3);
        shape[1] = new Circle(4.5);
        shape[2] = new Triangle(23.1,45);

        System.out.println(" Rectangle Area: " + shape[0].calculateArea());
        System.out.println("Circle Area: " + shape[1].calculateArea());
        System.out.println("Triangle Area: " + shape[2].calculateArea());
    }
}
