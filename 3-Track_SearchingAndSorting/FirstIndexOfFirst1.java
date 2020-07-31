import java.util.Arrays;

public class FirstIndexOfFirst1
{
    public static int firstIndexOf1(int arr[], int l, int r)
    {
        if(l <= r)
        {
            int mid = l + (r - l)/2;
            if((mid == 0 || arr[mid-1] == 0) && arr[mid] == 1)
                return mid;
            else if(arr[mid] == 0)
                return firstIndexOf1(arr, mid + 1, r);
            else
                return firstIndexOf1(arr, l, mid - 1);
        }
        else
            return -(l +1);
    }

    public static void main(String[] args)
    {
        int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        int index = firstIndexOf1(arr, 0, arr.length-1);
        
        if( index < 0)
            System.out.println("1 not exists in array");
        else
            System.out.println("" + index);
    }
}