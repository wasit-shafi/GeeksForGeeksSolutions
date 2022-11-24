// { Driver Code Starts
import java.io.*;
import java.util.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Leader obj = new Leader();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.leaders(arr, n);
		    
		    for(int i=0; i<res.size(); i++){
		        str.append(res.get(i)+" ");
		    }
		    System.out.println(str);
		}
		
	}
}
// } Driver Code Ends


class Leader
{
    static ArrayList<Integer> leaders(int arr[], int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int temp, arrayListSize, count = 1, max = arr[n - 1];
    
        arrayList.add(max);
        for(int i = n - 2 ; i >= 0 ; i--)
        {
            if(arr[i] >= max) 
            {
                max = arr[i];
                arrayList.add(arr[i]);
            }
        }
        
        arrayListSize = arrayList.size();
        for(int i = 0, j = arrayListSize - 1 ; i < j ; i++, j--)
        {
            temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(j));
            arrayList.set(j, temp);
        }
        return arrayList;
    }
}