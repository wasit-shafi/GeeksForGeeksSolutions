/**
 *  @author wasitshafi
 *  @since 24-06-2020
 */
import java.lang.Math;
import java.util.Scanner;

public class NoOfDigits
{
    public static int getNoOfDigits(int number)
    {
        return (int)(Math.floor(Math.log10(number) + 1));
    }

    public static void main(String args[])
    {
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number... ");
        number = scan.nextInt();

        System.out.println("No. of digits in " + number + " is : " + getNoOfDigits(number)); // Time Complexity : O(1)
        scan.close();
    }
}