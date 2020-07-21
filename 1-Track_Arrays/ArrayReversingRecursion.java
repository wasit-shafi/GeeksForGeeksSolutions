/**
 *  @author wasitshafi
 *  @since  02-07-20
 */
import java.util.Scanner;

public class ArrayReversingRecursion
{
    public static void reverse(int arr[], int i, int j)
    {
        if(i < j)
        {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            reverse (arr, i + 1, j -1);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 2 ,3, 4, 5}, len;

        len = arr.length;
        reverse(arr, 0, arr.length - 1);

        System.out.print("Array Elements : ");
        for(int i = 0 ; i < len ; i++) System.out.print(arr[i]);
    }
}