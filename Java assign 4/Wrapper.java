/* Q.1 1.Write a Java program that compares two wrapper objects for equality and demonstrates 
   when to use equals() instead of == (try with Integer or Float classes)  */

public class wrapper {
    public static void main(String[] args) {
        Float f1 = 1.0f; 
        Float f2 = 1.0f; 
        
        Integer i1 = 100; 
        Integer i2 = 100; 

        System.out.println("Using '==' for wrapper objects: " + (i1 == i2));
        System.out.println("Using 'equals()' for wrapper objects: " + i1.equals(i2));

        Integer i3 = new Integer(100);
        Integer i4 = new Integer(100);

        System.out.println("Using '==' for wrapper objects: " + (i3 == i4)); 
        System.out.println("Using 'equals()' for wrapper objects: " + i3.equals(i4));

        System.out.println("Using '==' for wrapper objects: " + (f1 == f2));
        System.out.println("Using 'equals()' for wrapper objects: " + f1.equals(f2));

        Float f3 = new Float(1.0);
        Float f4 = new Float(1.0);

        System.out.println("Using '==' for wrapper objects: " + (f3 == f4)); 
        System.out.println("Using 'equals()' for wrapper objects: " + f3.equals(f4));  
    }
}

/*Output:

Using '==' for wrapper objects: true
Using 'equals()' for wrapper objects: true
Using '==' for wrapper objects: false
Using 'equals()' for wrapper objects: true
Using '==' for wrapper objects: false
Using 'equals()' for wrapper objects: true
Using '==' for wrapper objects: false
Using 'equals()' for wrapper objects: true

*/

