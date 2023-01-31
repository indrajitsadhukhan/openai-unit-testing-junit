public class MathUtils{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int sumArray(int arr[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        sum+=arr[i];

        return sum;
    }
}
