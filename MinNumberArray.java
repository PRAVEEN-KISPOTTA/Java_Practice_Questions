package ArrayPracticeQuestion;

public class MinNumberArray {

	public static void main(String[] args) {
		int arr[] = {-1,2,3,44,5,6,6,7};
		int min = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]<min) {
				
				min = arr[i];
			}
		}
		System.out.println("Minium number of array is:");
		System.out.println(min);
		System.out.println(Integer.MAX_VALUE);

	}

}
