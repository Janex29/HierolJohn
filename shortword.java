public class shortword{
	public static void main(String[] args){
		
		String words = "Hello world everyone";
		String a[] = words.split(" ");
		String shortest = a[0];
		
		for(int i=0; i<a[i].length(); i++){
			if(a[i].length()<=shortest.length()){
			shortest=a[i];
			

				}
			}
		System.out.println("The shortest word is:"+shortest);	
		System.out.println("The length of the word:"+shortest.length());
		}

	}
