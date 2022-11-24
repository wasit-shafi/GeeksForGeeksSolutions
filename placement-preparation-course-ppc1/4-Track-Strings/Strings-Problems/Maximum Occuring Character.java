// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     MaxOccur obj = new MaxOccur();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}// } Driver Code Ends
class MaxOccur
{
    public static char getMaxOccuringChar(String line)
    {
        Character ch, key = null;
        int value = -1, len = line.length();
        TreeMap<Character, Integer> map = new TreeMap<>();
        
        for (int i = 0 ; i < len ; i++)
        {
            ch = line.charAt(i);
            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }
        
        for (Map.Entry<Character, Integer> m : map.entrySet())
        {
            if (m.getValue() > value)
            {
                key = m.getKey();
                value = m.getValue();
            }
        }
        return key;
    }
}