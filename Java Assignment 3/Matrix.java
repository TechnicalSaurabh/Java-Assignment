/* Q.4 Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object. The Matrix class has the following information:
a.	number of rows of matrix
b.	number of columns of matrix
c.	elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
a.	get the number of rows
b.	get the number of columns
c.	set the elements of the matrix at given position (i,j)
d.	adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
*/


public class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;

    // Constructor to initialize the matrix with given number of rows and columns
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    // Method to get the number of rows
    public int getRows() {
        return rows;
    }

    // Method to get the number of columns
    public int getColumns() {
        return columns;
    }

    // Method to set the elements of the matrix at given position (i, j)
    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid position");
        }
    }

    // Method to add two matrices
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Matrix result = new Matrix(this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return result;
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(1, 0, 3);
        matrix1.setElement(1, 1, 4);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setElement(0, 0, 5);
        matrix2.setElement(0, 1, 6);
        matrix2.setElement(1, 0, 7);
        matrix2.setElement(1, 1, 8);

        Matrix result = matrix1.add(matrix2);
        if (result != null) {
            System.out.println("Result of addition:");
            result.printMatrix();
        }
    }
}


/* Output:
Result of addition:
6 8 
10 12 

*/