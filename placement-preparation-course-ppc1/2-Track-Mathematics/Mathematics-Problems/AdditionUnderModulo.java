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
        
        while(t-- > 0) {
            String[] str = read.readLine().trim().split(" ");
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);
            
            System.out.println(new Modulo().sumUnderModulo(a,b));
        }
    }
}// } Driver Code Ends

class Modulo {
    public static long sumUnderModulo(long a, long b)
    {
        int M=1000000007;
        
        return ((a % M)  + (b % M)) % M;
    }   
}