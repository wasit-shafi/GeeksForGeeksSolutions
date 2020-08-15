class SearchElementInSortedMatrix
{
    static int[] search(int mat[][], int key)
    {
        int i = 0;
        int j = mat[0].length -1;
        int rows = mat.length;
        int index[] = new int[2];
        index[0] = index[1] = -1;

        while (i < rows && j >= 0)
        {
            if(mat[i][j] == key)
            {
                index[0] = i;
                index[1] = j;
                break;
            }
            else if (mat[i][j] >  key)
                j--;
            else
                i++;
        }
        return index;
    }

	public static void main(String[] args)
	{
		int mat[][] = {
			{ 1, 2, 3 },
			{ 4, 5, 6},
			{ 7, 8, 9},
			{ 10, 11, 12},
			{ 13, 14, 15}
        };

        System.out.println("Matrix : " + java.util.Arrays.deepToString(mat));
        System.out.print("Enter Key Element... ");
        int key = new java.util.Scanner(System.in).nextInt();
        
        int index[] = search(mat, key); // Time Complexity O(N)
        System.out.println("");
        if (index[0] == -1)
            System.out.println("Element not found.");
        else
            System.out.println(key + " found at index (" + index[0] + ", " + index[1] + ")");
    }
}