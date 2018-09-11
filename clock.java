import cs1.Keyboard;
import java.util.Scanner;

public class clock
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int hourStart;
		int minStart;
		int hourLate;
		int minLate;
		int calcHour;
		int calcMin;
		int finalInt;
		int futurehour;

		System.out.print("Enter the hour of the start time: ");
		hourStart = input.nextInt();

		System.out.print("Enter the minutes of the start time: ");
		minStart = input.nextInt();

		System.out.print("Enter the number of hours later: ");
		hourLate = input.nextInt();

		System.out.print("Enter the number of minutes later: ");
		minLate = input.nextInt();

		// Convert zero o'clock to twelve o'clock
		if (hourLate == 0)
				{
				  hourLate = 12;
		}

		calcHour = hourStart + hourLate;
		calcMin = minStart + minLate;
		// get hours by doing calcMin / 60
		calcHour += calcMin / 60;
		// get remaining minutes by doing % 60
		calcMin = calcMin % 60;

		System.out.printf("Future time = %s:%s Oclock ",calcHour, calcMin );

	}
}