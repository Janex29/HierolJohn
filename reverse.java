//Hierol John Carbonell

public class reverse{
	public static void main(String[] args){
		
		String a = "Hierol John Carbonell";
		String reverse = "";
		
		
		for (int i = a.length()-1; i>=0;i--){
			reverse = reverse + a.charAt(i);
		} 
			System.out.println("The string:"+ a);
			System.out.print("The reversed string:"+  reverse);
	}
}