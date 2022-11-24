// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str = read.readLine();
            System.out.println(new MissingPanagram().missingPanagram(str));
        }
    }
}// } Driver Code Ends
class MissingPanagram
{
    public static String missingPanagram(String str)
    {
        Character ch;
        int len = str.length();
        boolean arr[] = new boolean[26];
        boolean Arr[] = new boolean[26];
        StringBuilder ans = new StringBuilder("");
        
        for (int i = 0 ; i < len ; i++)
        {
            ch = str.charAt(i);
            if(ch >= 65 && ch <= 90)
                Arr[ch - 65] = true;
            else
                arr[ch - 97] = true;
        }
        
        for (int i = 0 ; i < 26 ; i++)
            if (arr[i] == false && Arr[i] == false)
                ans.append((char)(97 + i));
                
        return ans.toString();
    }
}