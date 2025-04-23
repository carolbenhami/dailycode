import java.io.*;
import java.util.*;

/**
 * Main class that manages student records.
 * This class demonstrates file I/O and exception handling in Java.
 * 
 * The StudentRecordsManager handles:
 * - Reading student data from CSV files
 * - Processing and validating the data
 * - Calculating statistics
 * - Writing formatted results to output files
 * - Proper exception handling throughout the process
 */
public class StudentRecordsManager {
    
    /**
     * Main method to run the program.
     * Handles user input and delegates processing to other methods.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        StudentRecordsManager manager = new StudentRecordsManager();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input filename: ");
        String inputFile = scanner.nextLine();

        System.out.print("Enter output filename: ");
        String outputFile = scanner.nextLine();

        try {
            /**
             * TODO: Call the processStudentRecords method with appropriate parameters
             *
             * This should pass the inputFile and outputFile variables to the method
             */
            processStudentRecords(inputFile, outputFile);
        } catch (Exception e) {
            /**
             * TODO: Handle general exceptions
             *
             * - Display a user-friendly error message
             * - Include the exception's message for debugging purposes
             * - Consider using System.err instead of System.out for error messages
             */
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            /**
             * The scanner is closed in the finally block to ensure resources are
             * properly released regardless of whether an exception occurred.
             * This demonstrates proper resource management.
             */
            scanner.close();
        }
    }
    
    /**
     * Process student records from an input file and write results to an output file.
     * This method orchestrates the entire data processing workflow.
     * 
     * @param inputFile Path to the input file containing student records
     * @param outputFile Path to the output file where results will be written
     */
    public static void processStudentRecords(String inputFile, String outputFile) {
        try {
            /**
             * TODO: Call readStudentRecords and writeResultsToFile methods
             * 
             * 1. Call readStudentRecords to get a list of Student objects
             * 2. Call writeResultsToFile to output the processed data
             * 3. Print a success message to the console
             */
            StudentRecordsManager manager = new StudentRecordsManager();
            List<Student> students = manager.readStudentRecords(inputFile);
            manager.writeResultsToFile(students, outputFile);
            System.out.println("Student records processed successfully. Output written to " + outputFile);
        } catch (FileNotFoundException e) {
            /**
             * TODO: Handle file not found exception
             * 
             * Provide a clear message indicating which file couldn't be found
             * and possibly suggest solutions (check spelling, path, etc.)
             */
            System.err.println("File not found: " + e.getMessage() + ". Please check the filename and path.");
        } catch (IOException e) {
            /**
             * TODO: Handle general I/O exceptions
             * 
             * These could be permission issues, disk full, etc.
             * Provide helpful information about the nature of the I/O problem.
             */
            System.err.println("I/O error while processing files: " + e.getMessage());
        }
    }
    
    /**
     * Read student records from a file and convert them to Student objects.
     * This method demonstrates file reading operations and exception handling.
     * 
     * @param filename Path to the input file
     * @return List of Student objects created from the file data
     * @throws IOException If an I/O error occurs during file reading
     */
    public List<Student> readStudentRecords(String filename) throws IOException {
        List<Student> students = new ArrayList<>();
        
        /**
         * TODO: Implement using try-with-resources to read the file
         * 
         * 1. Create a BufferedReader wrapped around a FileReader
         * 2. Read each line of the file
         * 3. For each line, parse the student data:
         *    - Split the line by commas
         *    - Extract studentId (parts[0]) and name (parts[1])
         *    - Parse the four grade values (parts[2] through parts[5])
         * 4. Create a Student object with the parsed data
         * 5. Add the Student object to the students list
         * 
         * Remember to handle these specific exceptions:
         * - NumberFormatException: When a grade cannot be parsed as an integer
         * - InvalidGradeException: When a grade is outside the valid range (0-100)
         * - ArrayIndexOutOfBoundsException: When a line has too few fields
         * 
         * For each exception, provide clear error messages that include the line number
         * where the error occurred for easier debugging.
         */
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;  // To track line numbers for error reporting

            while ((line = reader.readLine()) != null) {
                // Trim whitespace and check if the line is empty or just whitespace
                line = line.trim();
                if (line.isEmpty()) {
                    continue; // Skip empty lines
                }

                try {
                    String[] parts = line.split(","); // Split line by commas

                    // Check if there are exactly 6 fields (1 ID, 1 Name, 4 Grades)
                    if (parts.length != 6) {
                        System.err.println("Line " + lineNumber + ": Missing data - Expected 6 fields, found " + parts.length);
                        continue; // Skip this malformed line
                    }

                    // Extract the student data
                    String studentId = parts[0].trim();
                    String name = parts[1].trim();
                    int[] grades = new int[4];

                    try {
                        // Parse grades into integer array
                        for (int i = 0; i < 4; i++) {
                            grades[i] = Integer.parseInt(parts[i + 2].trim());
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Line " + lineNumber + ": Invalid grade format.");
                        continue; // Skip the line with invalid grades
                    }

                    // Create a new Student object and add it to the list
                    students.add(new Student(studentId, name, grades));
                } catch (Exception e) {
                    System.err.println("Line " + lineNumber + ": Unexpected error while processing the line.");
                    e.printStackTrace();  // Print stack trace for debugging
                }

                lineNumber++; // Increment line number for the next iteration
            }
        }

        return students;
    }
    /**
     * Write processed student results to an output file.
     * This method demonstrates file writing operations.
     * 
     * @param students List of Student objects to be written to the file
     * @param filename Path to the output file
     * @throws IOException If an I/O error occurs during file writing
     */
    public void writeResultsToFile(List<Student> students, String filename) throws IOException {
        /**
         * TODO: Implement using try-with-resources to write to the file
         * 
         * 1. Create a PrintWriter wrapped around a FileWriter
         * 2. Write a header section with title and separator
         * 3. Write each student's information
         * 4. Calculate and write class statistics:
         *    - Total number of students
         *    - Class average grade
         *    - Distribution of letter grades (how many A's, B's, etc.)
         * 
         * For calculating statistics:
         * 1. Initialize counters for each letter grade (A, B, C, D, F)
         * 2. Initialize a sum for calculating the average
         * 3. Loop through all students, incrementing counters and adding to sum
         * 4. Calculate the class average and format it to 2 decimal places
         * 5. Write all statistics to the file
         * 
         * Consider using a StringBuilder for building complex strings
         * before writing them to the file.
         */
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("=== Student Records Report ===");
            writer.println("--------------------------------");

            int total = students.size();
            double sum = 0;
            int[] gradeDist = new int[5]; // A, B, C, D, F

            for (Student s : students) {
                writer.println(s);
                double avg = s.getAverageGrade(); // Assumes getAverage() returns double
                sum += avg;

                if (avg >= 90) gradeDist[0]++;
                else if (avg >= 80) gradeDist[1]++;
                else if (avg >= 70) gradeDist[2]++;
                else if (avg >= 60) gradeDist[3]++;
                else gradeDist[4]++;
            }

            double average = total > 0 ? sum / total : 0;

            writer.println();
            writer.println("=== Class Statistics ===");
            writer.println("Total students: " + total);
            writer.printf("Class average: %.2f\n", average);
            writer.println("Grade distribution:");
            writer.println("A: " + gradeDist[0]);
            writer.println("B: " + gradeDist[1]);
            writer.println("C: " + gradeDist[2]);
            writer.println("D: " + gradeDist[3]);
            writer.println("F: " + gradeDist[4]);
        }
    }
}