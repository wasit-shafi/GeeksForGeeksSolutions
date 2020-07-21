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

class GfG
{
	public static long getSmallestDivNum(int n)
	{
	    long i = n, j;
	    boolean found = false;
	    
	    while(!found)
	    {
	        for(j = 2 ; j <= n && j % i == 0 ; j++);
	        
	        if(j == n + 1)
	        {
                found = true;
                break;
	        }
	        i++;
	    }
	    return i-1;
    }
}