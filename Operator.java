//Q. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Operator extends UserInput {

	public static void main(String[] args) {
		
		System.out.println("Enter two number.");
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		String op = sc.next();
		double result = 0;
		
		if (op.equals("+")) {
			
			result = num1+num2;
			
		}else if (op.equals("-")) {
			
			result = num1-num2;
			
		}else if (op.equals("*")) {
			
			result = num1*num2;
			
		}else if (op.equals("/")) {
			
			result = num1/num2;
			
		}else {
			
			System.out.println("/Invalid keyword/");
			
		}
		
		System.out.println("      "+result);
		

	}

}
