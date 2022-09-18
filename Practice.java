import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char op = sc.next().trim().charAt(0);
		
		
		int result = 0;
		while(true) {
		
		if (op == '+'||op =='-'||op =='/') {
			int a = sc.nextInt();
			int b = sc.nextInt();
		if(op == '+') {
			
			result = a+b;
		}else if (op == '-'){
			result = a-b;
		}
		}else if (op =='x'||op =='X') {
			break;
		}else {
			System.out.println("invalid");
		}System.out.println(result);

	}}

}
