//Hierol John Carbonell

public class strong{
	public static void main(String[] args){
		
		int num = 145;
		
		 if(strnum(num)){
		 	System.out.print(num+" is a strong numner.");
		 }
		 else{
		 	System.out.print(num+" is not a strong number.");
		 }
	}
	
	public static boolean strnum(int number){
		int ognum = number;
		int sum = 0;
		
		while (number>0){
			int digit = number % 10;
			sum += factorial(digit);
			number /= 10;
		}
		
		return sum == ognum;
	}
	
	public static int factorial(int number){
		if(number==0 || number==1){
			return 1;
		}
		else{
			return number * factorial(number-1);
		}
	}
}
