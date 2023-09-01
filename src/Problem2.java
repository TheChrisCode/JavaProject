import java.util.Scanner;

public class Problem2
{
    public static void main(String[] args)
    {
        // Make a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Call the function to calculate the average of 5 user inputs
        SquareLess100(input);
    }
    private static void SquareLess100(Scanner input)
    {
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if((number * number) == 100)
        {
            System.out.println("Your number squared equals 100.");
        }
        else if((number * number) > 100)
        {
            System.out.println("Your number squared is greater than 100.");
        }
        else if((number * number) < 100)
        {
            System.out.println("Your number squared is less than 100.");
        }
        else
        {
            System.out.println("Something went wrong.");
        }
    }
}