public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double sum = first + second;
		System.out.println("Sum : " + sum);
		
		double sub = first - second;
		System.out.println("Sub : " + sub);
		
		double div = first / second;
		System.out.println("Div : " + div);
		
		double mult = first * second;
		System.out.println("Mult : " + mult);
	}
}