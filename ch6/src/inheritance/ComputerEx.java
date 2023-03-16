package inheritance;

public class ComputerEx {

	public static void main(String[] args) {
		Computer computer = new Computer();
		double result = computer.areaCircle(10);
		System.out.println(result);
		
		Calculator calculator = new Calculator();
		System.out.println(calculator.areaCircle(10));
		

	}

}
