// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


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
		    
		    Trap obj = new Trap();
		    
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends

class Trap
{
    static int trappingWater(int arr[], int n)
    {
        int sum;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] > max) max = arr[i];
            leftMax[i] = max;
        }
            
        max = Integer.MIN_VALUE;
        for(int i = n-1 ; i >= 0 ; i--)
        {
            if(arr[i] > max) max = arr[i];
            rightMax[i] = max;   
        }
        sum = 0;
        for(int i = 0 ; i < n ; i++) sum += Math.min(leftMax[i], rightMax[i]) - arr[i];
        
        return sum;
    } 
}