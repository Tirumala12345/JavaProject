package Inheritance;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of Rectangle: " + rectangle.getArea());


        Circle circle = new Circle();
        System.out.println("perimeter of Circle:" + circle.getPerimeter());
        System.out.println("Area of Circle:" + circle.getArea());


    }
}
