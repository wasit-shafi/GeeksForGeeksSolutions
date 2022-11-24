// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Anagram obj = new Anagram();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}// } Driver Code Ends
class Anagram
{
    public static boolean isAnagram(String s1,String s2)
    {
        int freq[] = new int[26];
        int len = s1.length();
        for (int i = 0 ; i < len ; i++) freq[s1.charAt(i) - 'a']--;
        len = s2.length();
        for (int i = 0 ; i < len ; i++) freq[s2.charAt(i) - 'a']++;
            
        for (int i = 0 ; i < 26 ; i++)
            if (freq[i] != 0)
                return false;
        return true;
    }
}