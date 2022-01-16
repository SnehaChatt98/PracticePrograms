package mphasis_practice;

class java4_4 {
    void rightRotate(int arr[], int d, int n)
    {
        while (d > n) {
            d = d - n;
        }
        int temp[] = new int[n - d];
        for (int i = 0; i < n - d; i++)
            temp[i] = arr[i];
        for (int i = n - d; i < n; i++) {
            arr[i - n + d] = arr[i];
        }
        for (int i = 0; i < n - d; i++) {
            arr[i + d] = temp[i];
        }
    }
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args)
    {
        java4_4 rotate = new java4_4();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Array elements");
        for(int i=0;i<6;i++)
        	System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("Rotated array");
        rotate.rightRotate(arr, 5 , arr.length);
        rotate.printArray(arr, arr.length);
    }
}
