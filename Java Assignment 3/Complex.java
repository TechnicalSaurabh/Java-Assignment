/*Q.1 Print the sum, difference and product of two complex numbers by creating a class, named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user. 
Use Constructors to initialize the data members */

import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;


    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex c) {
        double realSum = this.real + c.real;
        double imaginarySum = this.imaginary + c.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    public Complex subtract(Complex c) {
        double realDifference = this.real - c.real;
        double imaginaryDifference = this.imaginary - c.imaginary;
        return new Complex(realDifference, imaginaryDifference);
    }

    public void print() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        double real1 = sc.nextDouble();
        double imaginary1 = sc.nextDouble();

        System.out.println("Enter the real and imaginary parts of the second complex number:");
        double real2 = sc.nextDouble();
        double imaginary2 = sc.nextDouble();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        System.out.println("Sum of the two complex numbers:");
        Complex sum = c1.add(c2);
        sum.print();

        System.out.println("Difference of the two complex numbers:");
        Complex difference = c1.subtract(c2);
        difference.print();
    }
}


/*Output:

Enter the real and imaginary parts of the first complex number:
20 30
Enter the real and imaginary parts of the second complex number:
10 20
Sum of the two complex numbers:
30.0 + 50.0i
Difference of the two complex numbers:
10.0 + 10.0i

*/