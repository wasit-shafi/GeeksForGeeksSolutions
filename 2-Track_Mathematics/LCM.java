/**
 *  @author wasitshafi
 *  @since 24-06-20
 */
import static java.lang.System.out;
import java.util.Scanner;

public class LCM
{
    public static int getLCM(int num1, int num2) // Also we know LCM = (num1 * num2) / GCD
    {
        int max_value = num1 > num2 ? num1 : num2;
        
        while(max_value % num1 != 0 || max_value % num2 != 0) max_value++;
        return max_value;
    }

    public static void main(String[] args)
    {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        
        out.print("Enter num1... ");
        num1 = scanner.nextInt();
        
        out.print("Enter num2... ");
        num2 = scanner.nextInt();
        
        out.println("LCM of " + num1 + " & " + num2 + " is : " + getLCM(num1, num2));
        scanner.close();
    }
}