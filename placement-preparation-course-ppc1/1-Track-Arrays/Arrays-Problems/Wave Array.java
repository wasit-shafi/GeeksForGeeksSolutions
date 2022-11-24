// { Driver Code Starts
import java.io.*;
import java.util.*;

class ArrayWave {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine().trim());// taking size of array
		    int arr[] = new int[n]; // declaring array of size n
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Wave obj = new Wave();
		    
		    
		    obj.convertToWave(arr, n);
		    
		    StringBuffer sb = new StringBuffer(); 
            for (int i = 0; i < n; i++) 
                sb.append(arr[i] + " "); 
                
		    System.out.println(sb); // print array
		}
	}
}


 // } Driver Code Ends

class Wave
{
    public static void convertToWave(int arr[], int n)
    {
        int temp;
        for(int i = 1 ; i < n ; i = i + 2)
        {
            temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
        }
    }
}

// { Driver Code Starts.
  // } Driver Code Ends