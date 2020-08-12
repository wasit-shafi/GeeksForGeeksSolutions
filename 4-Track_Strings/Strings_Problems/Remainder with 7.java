// { Driver Code Starts
import java.util.*;

class RemainderWith7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			System.out.println(g.remainderWith7(str));
		t--;
		}
	}
}// } Driver Code Ends
class GfG
{
    int remainderWith7(String num)
    {
        int series[] = {1, 3, 2, -1, -3, -2}, result = 0;
        
        for(int i = num.length() - 1, sIndex = 0; i >= 0 ; i--)
        {
            result += ((num.charAt(i) - '0') * series[sIndex++]);
            if(sIndex == 6) sIndex = 0;
            result = result % 7;
        }
        if(result < 0) result = (result + 7) % 7;
        
        return result;
    }
}