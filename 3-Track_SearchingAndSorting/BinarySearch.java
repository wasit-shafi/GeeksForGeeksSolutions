/**
 * @author wasitshafi
 * @since  31-07-20
 */
import java.util.Arrays;

public class BinarySearch
{
    public static int binarySearch(int arr[] , int l, int r, int key)
    {
        if(l <= r)
        {
            int mid = l + ((r - l) / 2);
            if(arr[mid] == key)
                return mid;
            else if(key > arr[mid])
                return binarySearch(arr, mid + 1, r, key);
            else
                return binarySearch(arr, l, mid - 1, key);
        }
        else
            return -(l + 1);
    }

    public static void main(String[] args)
    {
        int arr[] = {11, 66, 2, 33, 88, 99, 23, 56, 77};

        Arrays.sort(arr);
        System.out.println("Arr : " + Arrays.toString(arr));
        System.out.println("binarySearch(33) : " + binarySearch(arr, 0, arr.length - 1, 33));
        System.out.println("binarySearch(44) : " + binarySearch(arr, 0, arr.length - 1, 44));
    }
}