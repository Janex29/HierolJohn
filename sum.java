//Hierol John Carbonell

public class sum{
	public static void main(String[] args){
		
		int a[] = {1,2,3,6,8,10};
		int b = 0;
		
		for (int i = 0 ; i < a.length; i++){
			int c = a[i]%2;
		
		if (c !=0)
			continue;
			b += a[i];
			
		
	}
	System.out.println(b);
}
}