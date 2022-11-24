// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Array{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Subarray obj = new Subarray();
            obj.subarraySum(n, s, m);
            System.out.println();
        }
    }

}// } Driver Code Ends

class Subarray
{
    static void subarraySum(int n, int s, int[] m)
    {
        int sum = 0;
        
        for(int i = 1 ; i < n ; i++) m[i] = m[i] + m[i - 1];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i ; j < n ; j++)
            {
                if(i == 0) 
                    sum = m[j];
                else
                    sum = m[j] - m [i - 1];
                
                if(sum == s)
                {
                    System.out.print((i + 1) + " " + (j + 1));
                    return;
                }
                if(sum > s) break;
            }
        }
        System.out.print("-1");
        return;
    }
}