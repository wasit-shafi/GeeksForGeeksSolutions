// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

class Delete_Duplicate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int N = sc.nextInt();
			int a[] = new int[N];
			for(int i=0; i<N; i++)
				a[i] = sc.nextInt();
			
			GfG g = new GfG();
			int n = g.remove_duplicate(a,N);
			
			for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
			
			System.out.println();
			
		T--;
		}
	}
}// } Driver Code Ends


class GfG
{
	int remove_duplicate(int a[], int N)
	{
	    int i;
	    Set<Integer> s = new LinkedHashSet<>();

	    for(i = 0 ; i < N ; i++) s.add(a[i]);
	    i = 0;
	    Iterator<Integer> itr = s.iterator();
	    while(itr.hasNext()) a[i++] = itr.next();
	    
	    return i;
	   }
}