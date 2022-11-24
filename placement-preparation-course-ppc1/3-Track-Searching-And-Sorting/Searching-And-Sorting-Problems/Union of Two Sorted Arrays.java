// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t  =Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);
            
            int arr1[] = new int[N];
            int arr2[] = new int[M];
            
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
              arr1[i] = Integer.parseInt(st[i]);
            
            st = read.readLine().trim().split(" ");  
            for(int i = 0; i< M; i++)
              arr2[i] = Integer.parseInt(st[i]);
            
            Union obj = new Union();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.findUnion(arr1, arr2, N, M);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends
class Union
{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        Boolean isEmpty = true;
        int i = 0, j = 0, lastElement = -1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        while (i < n && j < m)
        {
            if (arr1[i] <= arr2[j])
            {
                if(isEmpty || arr1[i] > lastElement)
                {
                    isEmpty = false;
                    lastElement = arr1[i++];
                    arrayList.add(lastElement);
                }
                else
                    i++;
            }
            else
            {
                if(isEmpty || arr2[j] > lastElement)
                {
                    isEmpty = false;
                    lastElement = arr2[j++];
                    arrayList.add(lastElement);
                }
                else
                    j++;
            }
        }

        while (i < n)
        {
            if(isEmpty || arr1[i] > lastElement)
            {
                isEmpty = false;
                lastElement = arr1[i++];
                arrayList.add(lastElement);
            }
            else
                i++;
        }
        
        while (j < m)
        {
            if(isEmpty || arr2[j] > lastElement)
            {
                isEmpty = false;
                lastElement = arr2[j++];
                arrayList.add(lastElement);
            }
            else
                j++;
        }
        return arrayList;
    }
}