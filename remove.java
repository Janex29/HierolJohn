public class remove{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5};
		int rem[] = {1,2,2};
		
		for (int i=0; i<arr.length; i++){
			for (int x=0; x<rem.length; x++){
				if (arr[i]==(rem[x])){
				
				System.out.println(arr[i]);
				}
			}
		}
		
	}
}