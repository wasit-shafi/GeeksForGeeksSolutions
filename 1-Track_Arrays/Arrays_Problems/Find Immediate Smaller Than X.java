// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            String str[] = read.readLine().trim().split(" ");
            int arr[] = new int[n];
            
            for(int i =0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
            
            int x = Integer.parseInt(read.readLine());
            System.out.println(new Solution().immediateSmaller(arr, n, x));
        }
    }
}
// } Driver Code Ends

class Solution
{
    public static int immediateSmaller(int arr[], int n, int x)
    {
        int item = -1;
        for(int i = 0 ; i < n ; i++)
            if(arr[i] < x)
                if(item == -1)
                 item = arr[i];
                else if(arr[i] > item)
                 item = arr[i];
        return item;
    }
}