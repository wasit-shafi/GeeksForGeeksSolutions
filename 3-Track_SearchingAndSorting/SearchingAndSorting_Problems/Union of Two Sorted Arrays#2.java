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
        int t  =Integer.parseInt(read.readLine());
        
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
            for(int i = 0; i< M; i++)
              arr2[i] = Integer.parseInt(st[i]);
            
            Union obj = new Union();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.findUnion(arr1, arr2, N, M);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println(); 
        }
    }
}


// } Driver Code Ends
class Union
{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        while (i < n && j < m)
        {
            while (i + 1 < n && arr1[i] == arr1[i + 1]) i++;
            while (j + 1 < m && arr2[j] == arr2[j + 1]) j++;
            if (arr1[i] < arr2[j])
                ans.add(arr1[i++]);
            else if (arr2[j] < arr1[i])
                ans.add(arr2[j++]);
            else
            {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < n)
        {
            while (i + 1 < n && arr1[i] == arr1[i + 1]) i++;
            ans.add(arr1[i++]);
        }

        while (j < m)
        {
            while (j + 1 < m && arr2[j] == arr2[j + 1]) j++;
            ans.add(arr2[j++]);
        }
        
        return ans;
    }
}