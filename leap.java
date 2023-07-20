public class leap{
	public static void main(String[] args){
		
		int leapyr = 2023;
		int a = leapyr % 4;
		
		if (a == 0){
			System.out.print(leapyr+" is a Leap Year");
		}
		else
			System.out.print(leapyr+" is not Leap Year");
		}
	}