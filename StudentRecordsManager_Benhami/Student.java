import java.lang.*;
/**
 * Class representing a student record with grades.
 * This class demonstrates basic OOP principles and data encapsulation.
 */
public class Student {
    // TODO: Add private fields for studentId, name, grades array, averageGrade, and letterGrade
    private String studentId;
    private String name;
    private int[] grades;
    private double averageGrade;
    private char letterGrade;

    /**
     * Constructor to initialize a Student object
     * @param studentId The student's ID
     * @param name The student's name
     * @param grades Array of the student's grades
     */
    public Student(String studentId, String name, int[] grades) {
        // TODO: Initialize fields and calculate average and letter grade
        this.studentId = studentId;
        this.name = name;
        this.grades = grades;
        this.averageGrade = calculateAverage();
        this.letterGrade = determineLetterGrade();
    }
    
    /**
     * Calculates the average of all grades
     * @return The average grade as a double
     */
    private double calculateAverage() {
        // TODO: Calculate and return the average of all grades
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length; // Placeholder return
    }
    
    /**
     * Determines the letter grade based on the average
     * @return A character representing the letter grade (A, B, C, D, or F)
     */
    private char determineLetterGrade() {
        // TODO: Return letter grade based on the following scale:
        //       A: 90-100
        //       B: 80-89
        //       C: 70-79
        //       D: 60-69
        //       F: 0-59
        if (averageGrade >=90){
            return 'A';
        }
        else if (averageGrade >= 80 && averageGrade <= 89){
            return 'B';
        }
        else if (averageGrade >= 70 && averageGrade<= 79){
            return 'C';
        }
        else if (averageGrade >= 60 && averageGrade<= 69){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    
    // TODO: Implement getters for all fields
    // Hint: Follow standard Java naming conventions for getters (getXxx method names)

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    /**
     * Returns a string representation of the student
     * @return String containing all student information
     */
    @Override
    public String toString() {
        // TODO: Return a string representation of the student including:
        //       - ID, name, all grades, average (formatted to 2 decimal places), and letter grade
        // Hint: Use StringBuilder to efficiently build the string as shown in the slides
        // Hint: Use String.format("%.2f", averageGrade) to format the average to 2 decimal places
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: ").append(studentId)
                .append("\nStudent Name: ").append(name)
                .append("\nGrades: ");

        // Append grades as a comma-separated list
        for (int grade : grades) {
            sb.append(grade).append(" ");
        }

        sb.append("\nGrade Average: ").append(String.format("%.2f", averageGrade))
                .append("\nLetter Grade: ").append(letterGrade).append("\n\n");

        return sb.toString();
    }
}