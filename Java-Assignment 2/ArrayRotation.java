/*  6.	Java program for rotation of elements of array- left and right. An array is said to be right rotated if 

all the selected elements were moved towards right by one position   */



public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        int temp = array[array.length - 1]; // Store the last element
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1]; // Shift elements to the right
        }
        array[0] = temp; // Move the last element to the first position
        
        // Display the rotated array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}


/* Output :

5 1 2 3 4 


/*