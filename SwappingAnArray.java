package ArrayPracticeQuestion;
import java.util.Scanner;

public class SwappingAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		
		System.out.println("Enter a number:");
		for (int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int n = Math.floorDiv(arr.length, 2);
		
		int temp;
		
		for(int j = 0; j<n; j++) {
			temp = arr[j];
			arr[j] = arr[arr.length - 1 - j];
			arr[arr.length - 1 - j] = temp;
		}
		
		System.out.println("Swapping of array is:");
		for (int element : arr) {
			System.out.print(element+" ");
		}
		sc.close();

	}

}
