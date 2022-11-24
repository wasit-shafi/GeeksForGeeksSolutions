import java.util.Arrays;


public class CountNumberOfOccurencesInSortedArray_2
{
    public static int first_index(int arr[], int l, int r, int key)
    {
        if(l <= r)
        {
            int mid = l + ((r - l) / 2);
            if((mid == 0 || arr[mid - 1] < key) && arr[mid] == key)
                return mid;
            else if(key <= arr[mid])
                return first_index(arr, l, mid - 1, key);
            else
               return first_index(arr, mid + 1, r, key);
        }
        else
            return -(l+1);
    }

    public static int last_index(int arr[], int l, int r, int key)
    {
        if(l <= r)
        {
            int mid = l + (r - l) / 2;
            if((mid == arr.length-1 || arr[mid + 1] > key) && arr[mid] == key)
                return mid;
            else if(key >= arr[mid])
                return last_index(arr, mid + 1, r, key);
            else
                return last_index(arr, l, mid - 1, key);
        }
        else
            return -(l+1);
    }

    public static void main(String[] args)
    {
        int arr[] = {1, 1, 2, 2, 2, 2, 3, 5, 5, 5, 5, 5, 7, 7, 8 ,9, 9, 10, 10, 11}, len = arr.length, key = 5; 
        int first_index = first_index(arr, 0, len-1, key);
        int last_index = last_index(arr, 0, len-1, key);
        
        System.out.println("Arr[] : " + Arrays.toString(arr));
        if(first_index < 0)
            System.out.println("Element not exists in array");
        else
        {
            System.out.println("first_index : " + first_index);
            System.out.println("last_index  : " + last_index);
            System.out.println("Total No Of Occurences is : " + (last_index - first_index + 1));    
        }
    }
}