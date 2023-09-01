import java.util.Scanner;

public class Problem3
{
    public static void main(String[] args)
    {
        // Make a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Call the function to calculate the average of 5 user inputs
        average(input);
    }
    private static void average(Scanner input)
    {
        float average;

        //Get five int inputs from the user
        System.out.print("Enter a Number: ");
        int input1 = input.nextInt();

        System.out.print("Enter a Number: ");
        int input2 = input.nextInt();

        System.out.print("Enter a Number: ");
        int input3 = input.nextInt();

        System.out.print("Enter a Number: ");
        int input4 = input.nextInt();

        System.out.print("Enter a Number: ");
        int input5 = input.nextInt();

        //Calculate the sum and store it in the sum var
        int sum = input1 + input2 + input3 + input4 + input5;

        //Calculate the average
        average = sum/5.0f;

        //Print Out the average of the user inputs
        System.out.println("\nAverage: " + average);
    }
}