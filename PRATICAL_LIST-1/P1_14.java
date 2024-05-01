
import java.util.Scanner;
public class P1_14 
{
    public static void main(String s[]) 
    {        
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day number (1-7): ");
        int dayNumber = scanner.nextInt();

        String dayOfWeek;
        switch (dayNumber) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid day number";
                break;
        }

        System.out.println("Day of the week: " + dayOfWeek);

        scanner.close();
    }

    
}
