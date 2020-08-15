import java.util.ArrayList;
import java.util.Arrays;

class SpiralTraversal
{
	public static void main(String[] args)
	{
		int matrix[][] = {
		    { 1,  2,  3,  4,  5},
			{ 16, 17, 18, 19, 6},
			{ 15, 24, 25, 20, 7},
			{ 14, 23, 22, 21, 8},
			{ 13, 12, 11, 10,  9}
        };
        /*
        int matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}
        };*/
        int i, rf = 0, cf = 0, rl = matrix.length - 1, cl = matrix[0].length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (rf <= rl && cf <= cl)
        {
            for (i = cf; i <= cl; i++) list.add(matrix[rf][i]);
            rf++;

            for (i = rf; i <= rl; i++) list.add(matrix[i][cl]);
            cl--;

            if (rf <= rl)
            {
                for (i = cl; i >= cf; i--) list.add(matrix[rl][i]);
                rl--;
            }

            if (cf <= cl)
            {
                for (i = rl; i >= rf; i--) list.add(matrix[i][cf]);
                cf++;
            }
        }
        System.out.println("list : " + list);
    }
}