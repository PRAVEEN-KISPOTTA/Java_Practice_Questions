package ArrayPracticeQuestion;

public class MaxNumberArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,55,6,7,8};
		int max = 0;
		
		for (int i = 0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum number is:");
		System.out.println(max);

	}

}
