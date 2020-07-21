// { Driver Code Starts
import java.io.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Kadane obj = new Kadane();
		    
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends

class Kadane
{
    int maxSubarraySum(int arr[], int n)
    {
        int max_ends_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n ; i++)
        {
            max_ends_here += arr[i];
            if( max_so_far < max_ends_here)  max_so_far = max_ends_here;
            if(max_ends_here < 0)  max_ends_here = 0;
        }
        return max_so_far;
    }
}