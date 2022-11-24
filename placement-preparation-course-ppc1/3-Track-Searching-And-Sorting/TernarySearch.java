/**
 * @author wasitshafi
 * @since  31-07-20
 */
import java.util.Arrays;

public class TernarySearch
{
    public static int ternarySearch(int arr[] , int l, int r, int key) // time complexity O(Log3 N) < O(Log2 N) 
    {
        if(l <= r)
        {
            int mid1 = l + ((r - l) / 3);
            int mid2 = r - ((r - l) / 3);
            if(arr[mid1] == key)
                return mid1;
            else if (arr[mid2] == key)
                return mid2;
            else if(key < arr[mid1])
                return ternarySearch(arr, l, mid1 - 1, key);
            else if (key > arr[mid2])
                return ternarySearch(arr, mid2 + 1, r, key);
            else
                return ternarySearch(arr, mid1 + 1, mid2 - 1, key);
        }
        else
            return -(l  + 1);
    }

    public static void main(String[] args)
    {
        int arr[] = {11, 66, 2, 33, 88, 99, 23, 56, 77};

        Arrays.sort(arr);
        System.out.println("Arr : " + Arrays.toString(arr));
        System.out.println("ternarySearch(33) : " + ternarySearch(arr, 0, arr.length - 1, 33));
        System.out.println("ternarySearch(44) : " + ternarySearch(arr, 0, arr.length - 1, 44));
    }
}