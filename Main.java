
/**
 * Main class.
 *
 * @author (Slesha Tuladhar)
 * @version (30/08/2023)
 */

public class Main
{
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
    }

    /**
     * Main method
     */
    public static void main(String[] args)
    {
        Assignment assignment = new Assignment();
        assignment.inputAssignmentName();
        
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.inputStudentMarks();
        
        assignment.printAssignmentName();
        studentMarks.printStudentMarks();
    }
}
