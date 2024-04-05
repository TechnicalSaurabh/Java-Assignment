/*
8.	Create a student class with the following data members:- rollNo, Name,
Course, Mark, grade, result. Develop function members to
a.	assign values for rollNo, name, course and mark.
b.	Find out the grade for the student(if mark >90, then grade is A, if mark is between 80 and 90, then grade is B, if mark is between 70 and 80, then grade is C, if mark is between 60 and 70, then grade is D, otherwise, grade is F.
c.	Find the result of the student. If mark>60, then the result is Pass, otherwise Fail
d.	Print out the details of the student


*/

public class Student {
    private int rollNo;
    private String name;
    private String course;
    private int mark;
    private String grade;
    private String result;

    // Constructor
    public Student(int rollNo, String name, String course, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.mark = mark;
        // Determine grade and result based on the mark
        determineGradeAndResult();
    }

    // Method to assign values for rollNo, name, course, and mark
    public void assignValues(int rollNo, String name, String course, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.mark = mark;
        // Determine grade and result based on the mark
        determineGradeAndResult();
    }

    // Method to find out the grade for the student
    private void determineGradeAndResult() {
        if (mark > 90) {
            grade = "A";
            result = "Pass";
        } else if (mark >= 80) {
            grade = "B";
            result = "Pass";
        } else if (mark >= 70) {
            grade = "C";
            result = "Pass";
        } else if (mark >= 60) {
            grade = "D";
            result = "Pass";
        } else {
            grade = "F";
            result = "Fail";
        }
    }

    // Method to print out the details of the student
    public void printDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }

   
    public static void main(String[] args) {
        Student student = new Student(51, "Saurabh Yadav", "Computer Science", 85);
        student.printDetails();
        System.out.println("==================================");

        
        student.assignValues(18, "Virat Kohli", "Mathematics", 75);
        student.printDetails();
    }
}


/* Output:

Roll No: 51
Name: Saurabh Yadav
Course: Computer Science
Mark: 85
Grade: B
Result: Pass
==================================
Roll No: 18
Name: Virat Kohli
Course: Mathematics
Mark: 75
Grade: C
Result: Pass


*/
















