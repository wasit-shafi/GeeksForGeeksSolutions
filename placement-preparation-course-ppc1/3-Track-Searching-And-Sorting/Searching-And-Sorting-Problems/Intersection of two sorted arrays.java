// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);
            
            int arr1[] = new int[N];
            int arr2[] = new int[M];
            
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
                arr1[i] = Integer.parseInt(st[i]);
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < M; i++)
                arr2[i] = Integer.parseInt(st[i]);
                
            ArrayList<Integer> v = new ArrayList<Integer>();
            v = new Intersection().printIntersection(arr1, arr2, N, M);
           
            for(int i=0;i<v.size();i++)
                System.out.print(v.get(i)+" ");
                
            System.out.println();
        }
    }
}
// } Driver Code Ends
class Intersection
{
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    {
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        while (i < n && j < m)
        {
            while (i + 1 < n && arr1[i] == arr1[i + 1]) i++;
            while (j + 1 < m && arr2[j] == arr2[j + 1]) j++;
            
            if (arr1[i] == arr2[j])
            {
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j]) i++;
            else if (arr2[j] < arr1[i]) j++;
        }
        return ans; 
    }
}