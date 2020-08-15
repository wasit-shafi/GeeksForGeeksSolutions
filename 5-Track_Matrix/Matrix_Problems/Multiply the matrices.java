// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();
            
            int A[][] = new int[n1][m1];
            for(int i = 0; i < n1; i++)
                for(int j = 0; j < m1; j++)
                    A[i][j] = sc.nextInt();

            int n2 = sc.nextInt();
            int m2 = sc.nextInt();
            int B[][] = new int[n2][m2];
            for(int i = 0; i < n2; i++)
                for(int j = 0; j < m2; j++)
                    B[i][j] =sc.nextInt();

            Solution ob = new Solution();
            int ans[][] = ob.multiplyMatrix(A,B);
            if(ans.length == 0)
                System.out.println(-1);
            else
            {
                for(int i = 0; i < ans.length; i++)
                for(int j = 0; j < ans[0].length; j++)
                    System.out.print(ans[i][j] +" "); 
                System.out.println();
            }
        }
    }
}// } Driver Code Ends

class Solution
{
    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        int m = A.length;
        int n = A[0].length;
        int p = B.length;
        int q = B[0].length;
        if (n != p) return new int[0][0];
        
        int sum = 0;
        int R[][] = new int[m][q];
        
        for (int i = 0 ; i < m ; i++)
            for (int j = 0 ; j < q ; j++)
                for (int k = 0 ; k < n ; k++)
                    R[i][j] += A[i][k] * B[k][j];
        return R;
    }
}