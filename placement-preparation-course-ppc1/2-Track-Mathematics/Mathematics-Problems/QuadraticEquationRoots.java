// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    Quadratic  obj=new Quadratic();
		    int a,b,c;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    obj.quadraticRoots(a,b,c);
		    System.out.println();
		}
		
	}
}
// } Driver Code Ends

class Quadratic
{
    public void quadraticRoots(int a,int b,int c)
    {
        int bSquare = b * b;
        int _4ac = 4 * a * c;
        
        if(bSquare < _4ac)
            System.out.print("Imaginary");
        else
        {
            int root1, root2;
            root1 = (int)Math.floor((-b + Math.sqrt(bSquare - _4ac)) / (2.0 * a));
            root2 = (int)Math.floor((-b - Math.sqrt(bSquare - _4ac)) / (2.0 * a));
            
            if(root1 > root2)
                System.out.print(root1 + " " + root2);
            else
                System.out.print(root2 + " " + root1);
        }
    }
}