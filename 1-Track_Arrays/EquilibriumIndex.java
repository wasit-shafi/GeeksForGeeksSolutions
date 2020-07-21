/**
 *  @author wasitshafi
 *  @since  03-07-20
 */
import static java.lang.System.out;

public class EquilibriumIndex
{
    public static void main(String[] args)
    {
        int i, n, arr[] = {-7, 1, 5, 2, -4 ,3, 0};
        n = arr.length;

        out.print("Arr[] : ");
        for(i = 0 ; i < n ; i++) out.print(arr[i] + " ");
        for(i = 1 ; i < n ; i++) arr[i] += arr[i - 1]; // prefix sum
        for(i = 1 ; i < n - 1 ; i++)
            if(arr[i - 1] == arr[n-1] - arr[i])
                out.println("\ni : " + i );
    }
}