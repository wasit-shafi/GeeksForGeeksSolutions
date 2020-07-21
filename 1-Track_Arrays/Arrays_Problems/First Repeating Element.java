// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    
		    System.out.println(firstRepeated(arr,n));
		}
		
	}
	

 // } Driver Code Ends

public static int firstRepeated(int []arr, int n) 
{
    int index, max = Arrays.stream(arr).max().getAsInt();
    int firstIndex[] = new int[max + 1];
    boolean isRepeating[] = new boolean[max + 1];
    
    Arrays.fill(firstIndex, -1);
    Arrays.fill(isRepeating, false);

    for(int i = 0 ; i < n ; i++)
        if(firstIndex[arr[i]] == -1)
            firstIndex[arr[i]] = i;
        else
          isRepeating[arr[i]] = true;
    
    index = -1;
    for(int i = 0 ; i <= max ; i++)
        if(isRepeating[i] == true)//finding min index among repeating elements
            if(index == -1)
                index = firstIndex[i] + 1;
            else if(firstIndex[i] + 1 < index)
                index = firstIndex[i] + 1;
    
    return index;
}

// { Driver Code Starts.

}  // } Driver Code Ends