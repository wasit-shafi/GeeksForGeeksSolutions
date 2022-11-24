public class SegregatePositiveNegative
{
    public static void printArray(int array[])
    {
        int len = array.length;
        for(int i = 0 ; i < len ; i++) System.out.print(array[i] + " ");
    }

    public static void segregate(int []arr)
    {
        int temp, j = 0, len = arr.length;
        for(int i = 0 ; i < len ; i++)
            if(arr[i] <= 0)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
    }

    public static void main(String[] args)
    {
        int array1[] = {1, 2, 3, 4, 5, 6};
        int array2[] = {1, -2, 3, -4, 5, -6};
        int array3[] = {1, 2, -3, -4, -5, 6};
        int array4[] = {1, 2, 3, -4, -5, -6};
        
        System.out.print("array1[] : ");
        printArray(array1);
        segregate(array1);
        System.out.print("\narray1[] : ");
        printArray(array1);
        
        System.out.print("\n\narray2[] : ");
        printArray(array2);
        segregate(array2);
        System.out.print("\narray2[] : ");
        printArray(array2);
        
        System.out.print("\n\narray3[] : ");
        printArray(array3);
        segregate(array3);
        System.out.print("\narray3[] : ");
        printArray(array3);
        
        System.out.print("\n\narray4[] : ");
        printArray(array4); 
        segregate(array4);
        System.out.print("\narray4[] : ");
        printArray(array4);

        System.out.println("");
    }
}