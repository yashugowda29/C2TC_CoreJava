
public class SwitchInString {

	public static void main(String[] args) {
		
		String currentDay=args[0];
		
		switch(currentDay)
		{
		case "Sunday":
			System.out.println("Today is Sunday");
			break;
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
		case "Thursday":
			System.out.println("Today is Thursday");
			break;
		case "Friday":
			System.out.println("Today is Friday");
			break;
		case "Saturday":
			System.out.println("Today is Saturday");
			break;
		}
	}

}
