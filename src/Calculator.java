
public class Calculator {
	
	public Calculator(){
		
	}
	
	public int add(int x, int y){
		return x+y;
	}
	
	public int sub(int x, int y){
		return x-y;
	}
	
	public int multiply(int x, int y){
		return x*y;
	}
	
	public double divide(int x, int y){
		return (double)x/(double)y;
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		System.out.println(cal.add(1, 2));
		System.out.println(cal.sub(1, 2));
		System.out.println(cal.multiply(5, 6));
		System.out.println(cal.divide(6, 5));
	}
}
