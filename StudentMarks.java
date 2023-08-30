
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

        this.marks = new int[this.totalStudents];

        for (int i = 0; i < this.totalStudents; i++) {
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
        for (int i = 0; i < this.totalStudents; i++) {
            int studentId = i + 1;
            System.out.println("Student " + studentId + ": " + this.marks[i]);
        }
    }
    
    /**
     * Get highest and lowest student marks
     */
    public void getHighestAndLowestMarks()
    {
        int highestMark = this.marks[0];
        int lowestMark = this.marks[0];

        for (int i = 1; i < this.totalStudents; i++) {
            if (this.marks[i] > highestMark) {
                highestMark = this.marks[i];
            }
            if (this.marks[i] < lowestMark) {
                lowestMark = this.marks[i];
            }
        }

        System.out.println("Highest Mark: " + highestMark);
        System.out.println("Lowest Mark: " + lowestMark);
    }
    
    /**
     * Calculate mean and standard deviation of the marks
     */
    public void calculateMeanAndStandardDeviation()
    {
        double sum = 0;
        for (int i=0; i < this.totalStudents; i++) {
            sum += this.marks[i];
        }
        double mean = sum / this.totalStudents;

        System.out.println("Mean: " + mean);
    }
}
