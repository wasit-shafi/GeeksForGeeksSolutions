import java.util.Arrays;

public class MissingAndRepeatingNumber
{
    public static void printMissingAndRepeatingNumber(int arr[]) // using negative index technique
    {
        int len = arr.length, missing = -1, repeating = -1;

        for(int i = 0 ; i < len ; i++)
            if(arr[Math.abs((arr[i])) - 1] < 0)
                repeating = Math.abs((arr[i]));
            else
                arr[Math.abs((arr[i])) - 1] = -arr[Math.abs((arr[i])) - 1]; 
        
        for(int i = 0 ; i < len ; i++)
            if(arr[i] > 0)
            {
                missing = i + 1;
                break;
            }

        System.out.println("Repeating Number : " + repeating);
        System.out.println("Missing Number   : " + missing);
    }

    public static void main(String[] args)
    {
        int arr[] = {2, 3, 2, 1, 5};

        System.out.println("arr[] : " + Arrays.toString(arr));
        printMissingAndRepeatingNumber(arr);
    }
}