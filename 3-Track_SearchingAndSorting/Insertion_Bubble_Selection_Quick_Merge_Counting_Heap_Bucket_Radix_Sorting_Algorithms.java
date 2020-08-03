/**
 * @author wasitshafi
 * @since  01-08-20
 */

import java.util.Arrays;
import static java.lang.System.out;

public class Insertion_Bubble_Selection_Quick_Merge_Counting_Heap_Bucket_Radix_Sorting_Algorithms
{
    // O(N^2) Time Complexity, O(1) Space Complexity, Inplace as well as Stable Sorting Algorithm
    public static void insertionSort(int arr[], int n)
    {
        int key, j;
        out.println("\nInsertion Sort:");
        out.println("Before Sorting arr[] : " + Arrays.toString(arr));

        for (int i = 1 ; i < n ; i++)
        {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key)
                arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }

        out.println("After Sorting arr[]  : " + Arrays.toString(arr));
    }

    // O(N^2) Time Complexity, O(1) Space Complexity, Inplace as well as Stable Sorting Algorithm
    public static void bubbleSort(int arr[], int n) 
    {
        out.println("\nBubble Sort:");
        out.println("Before Sorting arr[] : " + Arrays.toString(arr));
        
        for (int i = 0 ; i < n - 1 ; i ++)
            for (int j = 0 ; j < n - i - 1 ; j++)
                if (arr[j] > arr[j + 1])
                {
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                }

        out.println("After Sorting arr[]  : " + Arrays.toString(arr));
    }

    // O(N^2) Time Complexity, O(1) Space Complexity, Inplace Sorting & unstable Sorting Algorithm
    public static void selectionSort(int arr[], int n) 
    {
        int min_index = -1;
        out.println("\nSelection Sort:");
        out.println("Before Sorting arr[] : " + Arrays.toString(arr));

        for (int i = 0 ; i < n - 1 ; i++)
        {
            min_index = i;
            for (int j = i + 1 ; j < n ; j++)
                if (arr[j] < arr[min_index])
                    min_index = j;

            if (min_index != i)
            {
                arr[i] = arr[i] + arr[min_index];
                arr[min_index] = arr[i] - arr[min_index];
                arr[i] = arr[i] - arr[min_index];
            }
        }

        out.println("After Sorting arr[]  : " + Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int partition_index = partition(arr, low, high);
            quickSort(arr, low, partition_index - 1);
            quickSort(arr, partition_index + 1, high);
        }
    }

    static int partition(int arr[], int low, int high)
    {
        int i = low - 1, temp;
        for (int j = low ; j < high ; j++)
            if(arr[j] <= arr[high]) // arr[high] is pivot element
            {
                temp = arr[++i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return  i + 1;
    }
    /*
    static int partition(int[] arr, int low, int high) // first element as pivot
    {
        int low = 0, high = arr.length - 1;
        int i = high + 1 , temp;
        
        for (int j = high ; j > low ; j--)
            if(arr[j] >= arr[low]) // arr[low] is pivot element
            {
                temp = arr[--i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        temp = arr[i - 1];
        arr[i - 1] = arr[low];
        arr[low] = temp;

        return i - 1
    }
    */
    /* from hackerearth
    int partition ( int A[],int start ,int end) {
        int i = start + 1;
        int piv = A[start] ;            //make the first element as pivot element.
        for(int j =start + 1; j <= end ; j++ )  {
        //rearrange the array by putting elements which are less than pivot
           on one side and which are greater that on other.
    
              if ( A[ j ] < piv) {
                     swap (A[ i ],A [ j ]);
                i += 1;
            }
       }
       swap ( A[ start ] ,A[ i-1 ] ) ;  //put the pivot element in its proper place.
       return i-1;                      //return the position of the pivot
    }*/
    public static void mergeSort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int mid = low + ((high - low) / 2);// avoids overflow for large low and high values, also returns always lower mid even if indexes are negative(not in this case) 
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int arr[], int low, int mid, int high)
    {
        int i = 0, j = 0, k = low, n1 = mid - low + 1, n2 = high - mid;

        int[] left = Arrays.copyOfRange(arr, low, mid + 1);  // range[x, y)
        int[] right = Arrays.copyOfRange(arr, mid + 1, high + 1);
        
        // Alternate code for copying elements
        /*
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int x = 0 ; x < n1 ; x++) left[x] = arr[low + x];
        for(int x = 0 ; x < n2 ; x++) right[x] = arr[mid + 1 + x];
        */

        while(i < n1 && j < n2)
            if(left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        
        while(i < n1) arr[k++] = left[i++];
        while(j < n2) arr[k++] = right[j++];
    }
    // CTM : counting sort is not a comparison sort
    // Time & Space Complexity : O(n+k), where 'n' is the size of arr, and 'k' is range of input(Max Element)
    public static void countingSort(int arr[], int n) // This version can't sort if array is having negative values
    {
        out.println("\n\nCounting Sort:");
        out.println("Before Sorting arr[] : " + Arrays.toString(arr));

        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max +1];
        int[] result = new int[n];

        for (int i = 0 ; i < n ; i++ ) count[arr[i]]++;
        for (int i = 1 ; i < max + 1 ; i++) count[i] += count[i - 1];
        // Traversing from right to left just maintain the stable sort
        for (int i = n - 1 ; i >= 0; i--) result[--count[arr[i]]] = arr[i];
        out.println("After Sorting arr[]  : " + Arrays.toString(result));
    }
    public static void countingSort_2(int arr[], int n)
    {
        out.println("\n\nCounting Sort:");
        out.println("Before Sorting arr[] : " + Arrays.toString(arr));

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int[] count = new int[range];
        int[] result = new int[n];

        for (int i = 0 ; i < n ; i++ ) count[arr[i] - min]++;
        for (int i = 1 ; i < range ; i++) count[i] += count[i - 1];
  
        for (int i = n - 1 ; i >= 0; i--) result[--count[arr[i] - min]] = arr[i];
        out.println("After Sorting arr[]  : " + Arrays.toString(result));
    }
/*
    public static void heapSort(int arr[], int n)
    {
        out.println("\n\nHeap Sort:");
        out.println("Before Sorting arr[] : " + Arrays.toString(arr));

        out.println("After Sorting arr[]  : " + Arrays.toString(arr));
    }

    public static void bucketSort(int arr[], int n)
    {
        out.println("\n\nBucket Sort:");
        out.println("Before Sorting arr[] : " + Arrays.toString(arr));

        out.println("After Sorting arr[]  : " + Arrays.toString(arr));
    }

    public static void radixSort(int arr[], int n)
    {
        out.println("\n\nRadix Sort:");
        out.println("Before Sorting arr[] : " + Arrays.toString(arr));

        out.println("After Sorting arr[]  : " + Arrays.toString(arr));
    }
*/
    public static void main(String[] args)
    {
       int arr[] = { 5, 22, 15, 0, -5, -64, 4, 2, 1, -8, 3, 12, 150 }, len = arr.length;
       int brr[] = { 5, 22, 15, 0, 4, 2, 1, 3, 12, 150}, lenBrr = brr.length; // Only Positive Elements
 
       insertionSort(arr.clone(), len);
       bubbleSort(arr.clone(), len);
       selectionSort(arr.clone(), len);

       // Quick Sort or Partition Sort
       int arr_quickSort[] = arr.clone();
       out.println("\nQuick Sort:");
       out.println("Before Sorting arr[] : " + Arrays.toString(arr_quickSort));
       quickSort(arr_quickSort, 0, arr_quickSort.length - 1);
       out.println("After Sorting arr[]  : " + Arrays.toString(arr_quickSort));

       // Merge Sort
       int arr_mergeSort[] = arr.clone();
       out.println("\nMegre Sort:");
       out.println("Before Sorting arr[] : " + Arrays.toString(arr_mergeSort));
       mergeSort(arr_mergeSort, 0, arr_mergeSort.length - 1);
       out.println("After Sorting arr[]  : " + Arrays.toString(arr_mergeSort));

       // Counting sort
       countingSort(brr.clone(), lenBrr);
       countingSort_2(arr.clone(), len); // with negative elements // V.V IMPORTANT    
    }
}