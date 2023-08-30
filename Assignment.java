
import java.util.Scanner;

/**
 * Assignment class.
 *
 * @author (Slesha Tuladhar)
 * @version (30/08/2023)
 */

public class Assignment
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class Assignment
     */
    public Assignment()
    {
    }

    /**
     * Input assignment name
     */
    public String inputAssignmentName()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter assignment name: ");
        this.name = input.nextLine();

        input.close();
        
        return this.name;
    }
}
