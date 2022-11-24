// { Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of testcases
        while (T > 0) {
            int I = sc.nextInt();
            Absolute obj = new Absolute();
            System.out.println(obj.absolute(I));

            T--;
        }
    }
}
// } Driver Code Ends

class Absolute
{
    public int absolute(int I)
    {
        if(I < 0) I = -I;
        
        return I;
    }
}