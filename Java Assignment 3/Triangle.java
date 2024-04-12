/* Q.1	Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
  by creating a class named 'Triangle' with parameter in its constructor. */

public class Triangle{
     private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Area of the triangle: " + triangle.getArea());
        System.out.println("Perimeter of the triangle: " + triangle.getPerimeter());
    }
}

/* Output:

Area of the triangle: 6.0
Perimeter of the triangle: 12.0

*/