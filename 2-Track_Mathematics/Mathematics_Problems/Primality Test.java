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
		    Primality  obj=new Primality ();
		    int N;
		    N=sc.nextInt();
		    if(obj.isPrime(N))
		    System.out.println("Yes");
		    else
		    
		    System.out.println("No");
		    
		}
		
	}
}

// } Driver Code Ends

class Primality 
{
    public boolean isPrime(int N)
    {
        for(int i = 2 ; i * i <= N ; i++)
            if((N % i) == 0) 
                return false;
        return true;
    }
}