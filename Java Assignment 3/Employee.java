/* Q.3 Write a program by creating an 'Employee' class having the following methods and print the final salary.
a.	'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
b.	'AddSal()' which adds $10 to salary of the employee if it is less than $500.
c.	'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.  */

public class Employee {
    private double salary;
    private int hoursPerDay;

  
    public Employee(double salary, int hoursPerDay) {
        this.salary = salary;
        this.hoursPerDay = hoursPerDay;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    // Method to add $5 to salary if the number of hours worked per day is more than 6
    public void addWork() {
        if (hoursPerDay > 6) {
            salary += 5;
        }
    }

    // Method to print the final salary
    public void printFinalSalary() {
        System.out.println("Final Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(400, 7); // Example values
        employee.addSal();
        employee.addWork();
        employee.printFinalSalary();
    }
}



/* Output :

Final Salary: $415.0

*/