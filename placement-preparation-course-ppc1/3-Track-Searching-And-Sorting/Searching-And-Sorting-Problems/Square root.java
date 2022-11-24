// { Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			SquareRoot obj = new SquareRoot();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}// } Driver Code Ends

class SquareRoot
{
     long floorSqrt(long x)
	 {
	     long low = 0, high = x, mid, ans = -1;
	     while(low <= high)
	     {
	         mid = low + (high - low) / 2;
	         if(mid * mid == x)
	            return mid;
	         else if(mid * mid < x)
	         {
                low = mid + 1;
                ans = mid;
	         }
	         else
                high = mid - 1;
	     }
	     return ans;
		 // return (long)(Math.floor(Math.sqrt(x)));
	 }
}