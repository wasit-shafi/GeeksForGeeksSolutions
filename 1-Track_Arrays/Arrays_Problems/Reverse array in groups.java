// { Driver Code Starts
import java.io.*;
import java.util.*;


 // } Driver Code Ends

class Reverse
{
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k)
    {
        int start, end;
        if(k >= n)
        {
            for(start = 0, end = n - 1 ; start < end ; start++, end--)
            {
                mv.set(start, mv.get(start) ^ mv.get(end));
                mv.set(end, mv.get(start) ^ mv.get(end));
                mv.set(start, mv.get(start) ^ mv.get(end));
            }
        }
        else
        {
            int next, groups;
            
            next = 0;
            start = 0;
            end = k - 1;
            groups = n / k;
            for(int i = 1 ; i <= groups ; i++)
            {
                while(start < end)
                {
                    mv.set(start, mv.get(start) ^ mv.get(end));
                    mv.set(end, mv.get(start) ^ mv.get(end));
                    mv.set(start, mv.get(start++) ^ mv.get(end--));
                }
                next +=k;
                start = next;
                end = start + k - 1;
            }
            
            if(n % k != 0)
            {
                for(end = n - 1 ; start < end; start++, end--)
                {
                    mv.set(start, mv.get(start) ^ mv.get(end));
                    mv.set(end, mv.get(start) ^ mv.get(end));
                    mv.set(start, mv.get(start) ^ mv.get(end));
                }
            }
        }
        return mv;
    }
}

// { Driver Code Starts.

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine1[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine1[0]);
		    int k = Integer.parseInt(inputLine1[1]);
		    
		    ArrayList<Integer> mv = new ArrayList<>();
		    
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        mv.add(Integer.parseInt(inputLine2[i]));
		    }
		    
		    Reverse obj = new Reverse();
		    
		    mv = obj.reverseInGroups(mv, n, k);
		    
		    StringBuffer str = new StringBuffer();
		    
		    for(int i=0; i<n; i++){
		        str.append(mv.get(i) + " ");
		    }
		    System.out.println(str);
		}
	}
}

  // } Driver Code Ends