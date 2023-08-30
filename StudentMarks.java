
import java.util.Scanner;

/**
 * Write a description of class StudentMarks here.
 *
 * @author (Slesha Tuladhar)
 * @version (30/08/2023)
 */
public class StudentMarks
{
    // instance variables - replace the example below with your own
    private int[] marks;

    /**
     * Constructor for objects of class StudentMarks
     */
    public StudentMarks()
    {
    }

    /**
     * Input marks of 30 students
     *
     */
    public int[] inputStudentMarks()
    {
        Scanner scanner = new Scanner(System.in);

        int totalStudents = 30;
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

        for (int i = 0; i < totalStudents; i++) {
            int studentId = i + 1;
            System.out.println("Student " + studentId + ": " + this.marks[i]);
        }

        scanner.close();
        
        return this.marks;
    }
}
