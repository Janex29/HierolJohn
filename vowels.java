public class vowels{
	public static void main(String[] args){
		
		String input = "Hierolcute";
		char[] vowels = {'a','a','e','i','o','u','o'};
		char[] arr = input.toCharArray();
		int vcount = 0;
		
		for (int i = 0; i<arr.length; i++){
			char a = Character.toLowerCase(arr[i]);

				for (int x = 0; x<vowels.length; x++){
					char b = vowels[x];
					
							if (a==b){
								vcount++;
								break;
		
				}
			

			} 
			
		}
		
	System.out.println(vcount);
			
	}
	
}