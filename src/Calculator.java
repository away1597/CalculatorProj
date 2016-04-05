
public class Calculator {
	
	public Calculator(){
		
	}
	
	public int add(int x, int y){
		return x+y;
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add(1, 2);
	}
}
