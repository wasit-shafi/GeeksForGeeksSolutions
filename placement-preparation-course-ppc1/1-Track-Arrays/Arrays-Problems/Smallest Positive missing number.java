// { Driver Code Starts
import java.util.*;

class Main
{   
    
    public static void main (String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			int missing = new FindMissing().findMissing(arr,n);
			
			System.out.println(missing);
		}
    }
}// } Driver Code Ends

class FindMissing
{
    static int segregate(int arr[])
    {
        int temp,j = 0, len = arr.length;
        for(int i = 0 ; i < len ; i++)
            if(arr[i] <= 0)
            {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
            return j;// no of negatives numbers;
    }
    
    static int findMissing(int arr[], int size)
    {
        int i,index, negatives = segregate(arr);
        int arr2Size = size - negatives, arr2[] = new int [arr2Size];
        
        for(i = 0 ; i < arr2Size ; i++) arr2[i] = arr[i + negatives]; // copy all positives from arr[] to arr2;
        for(i = 0 ; i < arr2Size ; i++) // arr2[i] > 0
        {
            index = Math.abs(arr2[i]);
            if(index <= arr2Size && arr2[index - 1] > 0) //arr2[index-1] is used to check (index-1) is not previously marks, otherwise it will become +ve again
                arr2[index - 1] = -arr2[index - 1];
        }
        for(i = 0 ; i < arr2Size ; i++)
            if(arr2[i] > 0)
                return i+1;
        return i + 1;
    }
}