package mphasis_practice;

import java.util.Arrays;

class java4_5 {
    public static int Fourthsmallest(Integer[] arr)
    {

        Arrays.sort(arr);
        return arr[3];
    }

    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        System.out.print(Fourthsmallest(arr));
    }
}
