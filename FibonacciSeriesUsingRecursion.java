
        
class FibonacciSeriesUsingRecursion
{
    public static void main(String[]args)
    {
        System.out.print("0 1");
        printFib(0,1,10);
    }

    static void printFib(int a,int b,int count)
    {
        if(count>0)
        {
            int c=a+b;
            System.out.print(" "+c);
            printFib(b,c,count-1);
        }
    }
}