package mphasis_practice;

class java4_6 {
    public static int sum(int n)
    {
        int s = 0;
        for(int i=0;i<n;i++){
            s=s+i;
        }
        return s;
    }

    public static void main(String[] args)
    {
        int n = 5;
        System.out.print(sum(n));
    }
}
