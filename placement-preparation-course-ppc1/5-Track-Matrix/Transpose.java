import java.util.Arrays;

class Transpose
{
	public static void main(String[] args)
	{
		int mat[][] = {
			{ 1, 2, 3 },
			{ 4, 5, 6},
			{ 7, 8, 9},
			{ 10, 11, 12},
			{ 13, 14, 15}
        };

        int rows = mat.length;
        int cols= mat[0].length;
        int ans[][] = new int[cols][rows];

        System.out.println("Matrix           : " + Arrays.deepToString(mat));
        for (int i = 0 ; i < rows ; i++)
            for (int  j = 0 ; j < cols ; j++)
                ans[j][i] = mat[i][j];

        System.out.println("\nTranspose Matrix : " + Arrays.deepToString(ans));
    }
}