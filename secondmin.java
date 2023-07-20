public class secondmin{
	public static void main(String[] args){
		
		int array[] = {10,20,90,60,5,2};
		int min = 0;
		int secmin = 0;
		
		for(int i=0; i<array.length; i++){
			if(array[i]<min){
				secmin=min;
				min=array[i];
				
				else if(array[i]<secmin||array[i] != secmin){
					secmin = array[i];
				}
			}
			System.out.print(secmin);
		}
	}
}
