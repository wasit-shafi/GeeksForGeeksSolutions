// { Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
   /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = new QuickSort().partition(arr, low, high);
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }// } Driver Code Ends

class QuickSort
{
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
}