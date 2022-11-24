// { Driver Code Starts
import java.io.*;
import java.util.*;

class Equilibrium {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            EquilibriumPoint obj = new EquilibriumPoint();

            System.out.println(obj.equilibriumPoint(arr, n));
        }
    }
}// } Driver Code Ends

class EquilibriumPoint
{
    public static int equilibriumPoint(long arr[], int n)
    {
        int i;
        boolean found = false;
        
        if(n == 1) return n;
        for(i = 1 ; i < n ; i++)arr[i] += arr[i - 1];
        for(i = 1 ; i < n - 1 ; i++)
            if(arr[i - 1] == arr[n-1] - arr[i])
            {
                found = true;
                break;
            }
        if(found)
            return i + 1;
        else
            return -1;
    }
}