import java.util.Scanner;

class ControlStatemenets{
	public static void main(String[] args) {
		
		System.out.println("ControlStatements Demo");

		int a = 10, b=8;

		if(a>b) a = 0;
		else b = 0;
		
		System.out.println("a == " + a + " b == " + b);

		boolean hasData = false;

		if(hasData)
			System.out.println("We have data");
		else
			if(a==0)
				System.out.println("We don't have data and a==0");
			else
				System.out.println("We don't hhave data and a!=0");

		

		String season;
		Scanner monthInput = new Scanner(System.in);
		System.out.println("Enter a month(1-12): ");

		int month = monthInput.nextInt();

		switch (month){
			case 12:
			case 1:
			case 2:
				season = "Winter";
				break;
			case 3:
			case 4:
			case 5:
				season = "Spring";
				break;
			case 6:
			case 7:
			case 8:
				season = "Summer";
				break;
			case 9:
			case 10:
			case 11:
				season = "Fall";
				break;
			default:
				throw new RuntimeException("Illegal value");
		}

		System.out.println("The season is " + season + ".");

	}
}