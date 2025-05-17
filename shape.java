/*Create an abstract class Figure with an abstract method area and two integer variables
that represent x and y dimensions. Create three more classes Rectangle, Triangle and
Square that extend Figure and implement the area method appropriately. Illustrate
how the method area can be computed at run time for Rectangle, Square and Triangle
to achieve dynamic polymorphism*/
import java.util.Scanner;
abstract class Figure {
    int x;
    int y;

    Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void area();
}
class Rectangle extends Figure {
    Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (x * y));
    }
}
class Triangle extends Figure {
    Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    void area() {
        System.out.println("Area of Triangle: " + (0.5 * x * y));
    }
}
class Square extends Figure {
    Square(int x) {
        super(x, x); // For square, both dimensions are the same
    }

    @Override
    void area() {
        System.out.println("Area of Square: " + (x * x));
    }
}
@SuppressWarnings("unused")
    class shape{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the dimensions for Rectangle (length and breadth):");
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            Figure rectangle = new Rectangle(length, breadth);
            rectangle.area();

            System.out.println("Enter the dimensions for Triangle (base and height):");
            int base = sc.nextInt();
            int height = sc.nextInt();
            Figure triangle = new Triangle(base, height);
            triangle.area();

            System.out.println("Enter the side length for Square:");
            int side = sc.nextInt();
            Figure square = new Square(side);
            square.area();
        }
    }//     sc.close();