import java.math.BigDecimal;
import java.util.Scanner;

public class Input
{
    private static Scanner sc = new Scanner(System.in);

    public static char getChar()
    {
        String in = sc.nextLine();
        if (in.toCharArray().length > 1)
        {
            System.out.println("accapp.Input to long, please only enter on character");
            return getChar();
        }
        try
        {
            return in.toCharArray()[0];
        }
        catch (Exception ex)
        {
            System.out.println("Error receiveing user input: " + ex.getStackTrace() + "\nplease try again.");
            return getChar();
        }
    }

    public static BigDecimal getDecimal()
    {
        String in = sc.nextLine();
        try
        {
            return new BigDecimal(in);
        }
        catch (Exception ex)
        {
            System.out.println("Error receiveing user input: " + ex.getStackTrace() + "\n please try again.");
            return getDecimal();
        }
    }
}