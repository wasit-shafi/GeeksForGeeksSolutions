// { Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}// } Driver Code Ends

class GfG
{
    int strstr(String str, String target)
    {
        int n = str.length();
        int m = target.length();
        int j, k, index = -1;
        // Since time Expected Time complexity is O(n*m), so i can use Naive Approach
        
        for(int i = 0 ; i < n - m + 1 ; i++)
        {
            j = i;
            k = 0;
            while(k < m && str.charAt(j) == target.charAt(k))
            {
                j++;
                k++;
            }
            if(k == m)
            {
                index = i;
                break;
            }
        }
        
        return index;
    }
}
