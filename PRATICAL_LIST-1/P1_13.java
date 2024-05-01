import java.util.Scanner;

public class P1_13 
{
    public static void main(String s[]) 
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) 
        {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int max = array[0];

        int index = 1;
        do 
        {
            if (array[index] > max) 
            {
                max = array[index];
            }
            index++;
        } 
        while (index < size);

        System.out.println("Maximum value in the array: " + max);

        scanner.close();
    }
}