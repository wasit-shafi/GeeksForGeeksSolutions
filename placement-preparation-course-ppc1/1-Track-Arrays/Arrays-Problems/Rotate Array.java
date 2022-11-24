// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
            String str=br.readLine();
    		String[] starr=str.split(" ");
    	    int n=Integer.parseInt(starr[0]);
    		int d= Integer.parseInt(starr[1]);
    		
            int[] arr=new int[n];
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		for(int j=0;j<n;j++)
    		{
    		  arr[j]= Integer.parseInt(starr1[j]);
    		}
    		
            new Solution().rotateArr(arr, d, n);
    		StringBuffer sb=new StringBuffer();
            for(int t1=0;t1<n;t1++)
                sb.append(arr[t1]+" ");
            System.out.println(sb);
         }
    }
}
// } Driver Code Ends

class Solution
{
    static void rotateArr(int arr[], int d, int n)
    {
        int temp;
        if(d >= n) d = d % n;
        for(int i = 0, j = d - 1 ; i < j ; i++, j--)
        {  
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        for(int i = d, j = n - 1 ; i < j ; i++, j--)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        for(int i = 0, j = n - 1 ; i < j ; i++, j--)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}