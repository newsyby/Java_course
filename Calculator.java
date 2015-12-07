public class Calculator {
	
	private Double result;
	
	public void add(double ... params){
		for (Double param : params){
			this.result += param;
		}
		
	}
	
	public void sub(double ... params){
		for (Double param : params){
			this.result -= param;
		}
		
	}
	
	public void mult(double ... params){
		for (Double param : params){
			this.result *= param;
		}
		
	}
	
	public void div(double ... params){
		for (Double param : params){
			this.result /= param;
		}
		
	}
		
	public double getResult(){
		return this.result;
	}
	
	public void cleanResult(){
		this.result = 0.0;
	}
	
}