// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;
class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Sol g=new Sol();
            System.out.println(g.multiply(a,b));
        }
    }
}// } Driver Code Ends
class Sol
{
    public String multiply(String a,String b)
    {
        return new BigInteger(a).multiply(new BigInteger(b)).toString();
    }
}