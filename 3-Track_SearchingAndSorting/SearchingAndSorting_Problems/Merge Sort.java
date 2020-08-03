// { Driver Code Starts
import java.util.*;

class Merge_Sort
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void mergeSort(int arr[], int l, int r)
    {
        GfG g = new GfG();
        if (l < r)
        {
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);
            g.merge(arr, l, m, r);
        }
    }

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			Merge_Sort ms = new Merge_Sort();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			GfG g = new GfG();
			mergeSort(arr,0,arr.length-1);

			ms.printArray(arr);
		T--;
		}
	}
}


// } Driver Code Ends

class GfG
{
    void merge(int arr[], int l, int m, int r)
    {
        int i = 0, j = 0, k = l, n1 = m - l + 1, n2 = r - m;
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
        
        while(i < n1 && j < n2)
            if(left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        
        while(i < n1) arr[k++] = left[i++];
        while(j < n2) arr[k++] = right[j++];
    }
}