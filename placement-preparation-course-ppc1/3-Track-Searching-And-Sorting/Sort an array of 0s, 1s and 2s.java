// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    
 // } Driver Code Ends

public static void sort012(int a[], int n) // Counting Sort based
{
    int zero, one, two;
    zero = one = two = 0;
    for(int i = 0 ; i < n ; i++)
        if(a[i] == 0)
            zero++;
        else if(a[i] == 1)
            one++;
        else
            two++;  
    
    int index = 0;
    while(zero-- != 0) a[index++] = 0;
    while(one-- != 0) a[index++] = 1;
    while(two-- != 0) a[index++] = 2;
}

// { Driver Code Starts.

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
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends