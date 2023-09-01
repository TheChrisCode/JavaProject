import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float length = input.nextFloat();
        float width = input.nextFloat();

        calcPerimeter(length, width);
        calcArea(length, width);
    }
    private static void calcPerimeter(float l, float w)
    {
        float perimeter = 2 * l + 2 * w;
        System.out.println("Perimeter: " + perimeter);
    }
    private static void calcArea(float l, float w)
    {
        float area = l * w;
        System.out.println("Area: " + area);
    }
}