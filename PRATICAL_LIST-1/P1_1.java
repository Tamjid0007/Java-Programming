// Pr - 1 Write a Java program that declares three integer variables (a, b, c) and compute their sum and average.
public class P1_1 
{
    public static void main(String s[])
	{
        int a,b,c,sum;
        float avg;
        a=10;
        b=20;
        c=30;
        sum=a+b+c;
        avg=sum/3;
        
        System.out.println("Sum of ::"+sum);
        System.out.println("Avg of ::"+avg);
    }
}
