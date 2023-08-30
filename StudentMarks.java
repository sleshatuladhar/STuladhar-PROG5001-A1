
import java.util.Scanner;

/**
 * Write a description of class StudentMarks here.
 *
 * @author (Slesha Tuladhar)
 * @version (30/08/2023)
 */
public class StudentMarks
{
    // instance variables
    private int[] marks;
    private int totalStudents = 30;

    /**
     * Constructor for objects of class StudentMarks
     */
    public StudentMarks()
    {
    }

    /**
     * Input marks of 30 students
     */
    public void inputStudentMarks()
    {
        Scanner scanner = new Scanner(System.in);

        this.marks = new int[totalStudents];

        for (int i = 0; i < totalStudents; i++) {
            int studentId = i + 1;
            int mark;

            do {
                System.out.print("Enter the mark for student " + studentId + ": ");
                mark = scanner.nextInt();

                if (mark < 0 || mark > 30) {
                    System.out.println("Invalid mark. Please enter a mark between 0 and 30.");
                }
            } while (mark < 0 || mark > 30);

            this.marks[i] = mark;
        }

        scanner.close();        
    }
    
    /**
     * Print student marks
     */
    public void printStudentMarks()
    {
        for (int i = 0; i < totalStudents; i++) {
            int studentId = i + 1;
            System.out.println("Student " + studentId + ": " + this.marks[i]);
        }
    }
}
