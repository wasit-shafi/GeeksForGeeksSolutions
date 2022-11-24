import java.util.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch_Using_API
{
    public static void main(String[] args)
    {
        int arr[] = {11, 66, 2, 33, 88, 99, 23, 56, 77};

        System.out.print("arr : ");
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++) System.out.print(arr[i] + " ");
        // It returns the index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1). 
        System.out.println("\nArrays.binarySearch(arr, 50) : " + Arrays.binarySearch(arr, 50));
        System.out.println("Arrays.binarySearch(arr, 23) : " + Arrays.binarySearch(arr, 23));


        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(66);
        list.add(2);
        list.add(33);
        list.add(88);
        list.add(99);
        list.add(23);
        list.add(56);
        list.add(77);

        System.out.print("\n\nList : ");
        Collections.sort(list);
        for(int i = 0 ; i < arr.length ; i++) System.out.print(list.get(i) + " ");
        System.out.println("\nCollections.binarySearch(list, 50) : " + Collections.binarySearch(list, 50));
        System.out.println("Collections.binarySearch(list, 23) : " + Collections.binarySearch(list, 23));
    }
}