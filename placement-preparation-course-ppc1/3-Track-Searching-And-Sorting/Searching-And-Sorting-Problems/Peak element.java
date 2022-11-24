// { Driver Code Starts
import java.util.*;
class PeakElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		
			int A=new Peak().peakElement(a,n);
			int f=0;
			if(n==1)
			f=1;
			else
			if(A==0 && a[0]>=a[1])
			f=1;
			else if(A==n-1 && a[n-1]>=a[n-2])
			f=1;
			else if(a[A] >=a[A+1] && a[A]>= a[A-1])
			f=1;
			else
			f=0;
			System.out.println(f);
		}
	}
}// } Driver Code Ends

class Peak
{
    // Using Binary Search based algo, index can be computed in O(log N) time complexity
	public int peakElement(int[] a,int n)
    {
        int i = 0;
        while(i < n)
        {
            if((i == 0 || a[i] >= a[i-1]) && (i == n - 1 || a[i] >= a[i+1]))
                break;
            i++;
        }
        return i;
    }
}