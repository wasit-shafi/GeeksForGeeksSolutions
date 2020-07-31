import java.util.Arrays;

public class PeekElement
{
    // Initially it look to me that this algorithm is not complete, but later proved it complete as well as optimal.
    // Peek Element is not smaller than its neighbour ie.-----3,3,3----- has a peek element(middle 3)
    public static int peekElement(int arr[], int l, int r)
    {
        if(l <= r)
        {
            int mid = l + (r - l)/2;
            
            if((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid] >= arr[mid+1]))
                return mid;
            else if(mid > 0 && arr[mid - 1] > arr[mid])
                return peekElement(arr, l, mid -1);
            else
                return peekElement(arr, mid + 1, r);
        }
        else
            return -(l +1);
    }

    public static void main(String[] args)
    {
        int arr[] = {10, 20, 15, 2, 23, 90, 67};
        int index = peekElement(arr, 0, arr.length-1); // this also work with unsorted arrays as well 
        
        if(index < 0)
            System.out.println("No Peek Exists...");
        else
            System.out.println("Peek Element : " + arr[index]);
    }
}