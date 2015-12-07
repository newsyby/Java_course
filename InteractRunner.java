import java.util.Scanner;

public class InteractRunner {
	public static void main (String[] arg){
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")){
								
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg :");
				String second = reader.next();
				System.out.println("Enter the operation: +, -, /, *");
				String sign = reader.next();
								
				switch(sign)
				{
				case "+":	
				calc.add(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result sum : " + calc.getResult());
				calc.cleanResult();
				break;
				
				case "-":
				calc.sub(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result sub : " + calc.getResult());
				calc.cleanResult();
				break;
				
				case "/":
				calc.div(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result div : " + calc.getResult());
				calc.cleanResult();
				break;
				
				case "*":
				calc.mult(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result mult : " + calc.getResult());
				calc.cleanResult();
				break;
				}
				
				System.out.println("Exit : yes/no");
				exit = reader.next();
				
			}
			
		} finally {
			reader.close();			
		}
					
	}
		
}