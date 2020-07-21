// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    GP  obj=new GP ();
		    int A,B;
		    A=sc.nextInt();
		    B=sc.nextInt();
		    int N;
		    N=sc.nextInt();
		   System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));
		    
		}
		
	}
}
// } Driver Code Ends

class GP 
{
    public double termOfGP(int A,int B, int N)
    {
        return A * Math.pow((double)B / A, N - 1);
    }
}