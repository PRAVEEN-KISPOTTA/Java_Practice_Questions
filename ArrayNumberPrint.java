package ArrayPracticeQuestion;

public class ArrayNumberPrint {

	public static void main(String[] args) {
		int[] marks = {1,2,3,4,5,6};
		
		for(int i = 0; i<marks.length; i++) {
			System.out.print(i+") "+marks[i]+", ");
			
		}
		System.out.println();
		
		for(int j = marks.length-1; j>=0; j--) {
			
			System.out.print(j+") "+marks[j]+", ");
		}
		System.out.println();
		
		for(int element: marks) {
			System.out.print(element+" ");
		}

	}

}
