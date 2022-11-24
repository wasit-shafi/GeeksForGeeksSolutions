import java.util.Arrays;

class Rotate
{
    static void printMatrix(int mat[][], int N)
    {
        for (int i = 0 ; i < N ; i++)
        {
            for (int  j = 0 ; j < N ; j++)
                System.out.printf("%3d ", mat[i][j]);
            System.out.println();
        }
    }

    static void rotateMatrix(int mat[][], int N)
	{
        int res[][] = new int[N][N];

        System.out.println("\n\nMethod 1 : ");
        for (int i = 0 ; i < N ; i++)
            for (int j = 0 ; j < N ; j++)
                res[N - j - 1][i] = mat[i][j];

        mat = res;
        System.out.println("Matrix after rotation : ");
        printMatrix(mat, N);
    }

    static void rotateMatrix_2(int mat[][], int N)
	{
        int temp[][] = new int[N][N];

        for (int i = 0 ; i < N ; i++) temp[i] = mat[i].clone();            
        System.out.println("\n\nMethod 2 : ");
       
        for (int i = 0 ; i < N ; i++)
            for (int j = 0 ; j < N ; j++)
                mat[i][j] = temp[j][N - i - 1];

        System.out.println("Matrix after rotation : ");
        printMatrix(mat, N);
    }

    static void rotateMatrix_3(int mat[][], int N)
	{
        System.out.println("\n\nMethod 3 : ");
       
        int temp, half = N/2;
        for(int i = 0 ; i < half ; i++)
        {
            for(int j = i ; j < N - i - 1 ; j++)
            {
                temp = mat[i][j];
                mat[i][j] = mat[j][N - 1 - i];
                mat[j][N - 1 - i] = mat[N - 1 - i][N - 1 - j];
                mat[N -  1 - i][N - 1 - j] = mat[N - 1 - j][i];
                mat[N - 1 - j][i] = temp;
            }
        }
        System.out.println("Matrix after rotation : "); 
        printMatrix(mat, N);
    }

	public static void main(String[] args)
	{
		int mat[][] = {
			{ 1, 2, 3, 4 },
			{ 5, 6, 7, 8 },
			{ 9, 10, 11, 12 },
			{ 13, 14, 15, 16 }
        };
		int mat2[][] = {
			{ 1, 2, 3, 4 },
			{ 5, 6, 7, 8 },
			{ 9, 10, 11, 12 },
			{ 13, 14, 15, 16 }
        };
        final int N = mat.length;

        System.out.println("MARIX : ");
        //System.out.println(Arrays.deepToString(mat));
        printMatrix(mat, N);
       
        rotateMatrix(mat, N);    // Time Complexity : O (n * n), Space Complexity : O(n * n)
        rotateMatrix_2(mat, N);  // Time Complexity : O (n * n), Space Complexity : O(n * n)
        rotateMatrix_3(mat2, N); // Time Complexity : O (n * n), Space Complexity : O(1)
	}
}