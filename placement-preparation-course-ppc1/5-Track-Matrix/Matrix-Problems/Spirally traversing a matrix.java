// { Driver Code Starts


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
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends
class Solution
{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        int k;
        int i1 = 0, i2 = r - 1;
        int j1 = 0, j2 = c - 1;
        ArrayList<Integer> res = new ArrayList<>();
        
        while (i1 <= i2 && j1 <= j2)
        {
            for (k = j1 ; k <= j2 ; k++) // first row(left to right)
                res.add(matrix[i1][k]);
            
            for(k = i1 + 1 ; k <= i2 ; k++) // last column(up to down)
                res.add(matrix[k][j2]);
            
            for(k = j2 - 1 ; k >= j1 ; k--) // last row(right to left)
                res.add(matrix[i2][k]);
            
            for(k = j2 - 1 ; k > j1 ; k--) // first column(down to up)
                res.add(matrix[k][j1]);
            i1++;
            j1++;

            i2--;
            j2--;
        }
        return res;
    }
}