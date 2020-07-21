// { Driver Code Starts
import java.util.*;
class SDN{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			GfG g=new GfG();
			System.out.println(g.getSmallestDivNum(n));
		}
	}
}// } Driver Code Ends

class GfG{
	public static long gcd(long a, long b)
	{
	    if(b == 0)
	        return a;
	 
	    return gcd(b, a % b);
	}
	
	public static long getSmallestDivNum(int n)
	{
	    long LCM = 1;
	  
	    for(int i = 2 ; i <= n ; i++) LCM = i * LCM / gcd(LCM, i); // CTM : LCM * HCF = a * b
	    
	    return LCM;
    }
}