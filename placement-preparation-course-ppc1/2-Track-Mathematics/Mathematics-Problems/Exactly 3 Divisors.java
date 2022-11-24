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
		    Divisors obj=new Divisors();
		    int N;
		    N=sc.nextInt();
		    
		    System.out.println(obj.exactly3Divisors(N));
		   
		    
		}
		
	}
}
// } Driver Code Ends

class Divisors
{
    public int exactly3Divisors(int N)
    {
        int count, n = (int)Math.sqrt(N);
        boolean sieve[] = new boolean[n + 1];

        Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;
        
        for(int i = 2 ; i <= n ; i++)
            if(sieve[i])
                for(int j = i * i ; j <= n ; j = j + i)
                    sieve[j] = false;
        
        count = 0;
        for(int i = 0 ; i <= n ; i++)
            if(sieve[i])
                count++;
        
        return count;
    }
}