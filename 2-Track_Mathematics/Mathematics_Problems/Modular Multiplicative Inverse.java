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
		    Modular  obj=new Modular ();
		    int a,m;
		    a=sc.nextInt();
		    m=sc.nextInt();
		    
		    
		    System.out.println(obj.modInverse(a,m));
		   
		    
		}
		
	}
}

// } Driver Code Ends

class Modular 
{
    public int modInverse(int a, int m)
    {
        for(int i = 1 ; i < m ; i++)
            if(i * a % m == 1)
                return i;
        return -1;
    }
}