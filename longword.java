public class longword{
	public static void main(String[] args){
		
		String words = "Hello world everyone elsseeeeee";
		String []a = words.split(" ");
		String longest = "";
		
//		for(String b:a){
//			if(b.length()>longest.length()){
//			longest=b; 
			
//				}
//			}

		for(int i=0; i<a.length; i++){
			if(a[i].length()>longest.length()){
				longest=a[i];
				}
			}
		System.out.println("The longest word is:"+longest);	
		System.out.println("The length of the word:"+longest.length());
		
		}

	}
