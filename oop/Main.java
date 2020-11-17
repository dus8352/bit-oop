package oop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorDTO calculator = new CalculatorDTO();
		CalculatorController controller = new CalculatorController();
		System.out.println("계산기 시작");
		System.out.println("수 입력");
		calculator.setNum1(scanner.nextInt());
		System.out.println("엽산자입력 +, -, *, /, %");
		calculator.setOpcode(scanner.next());
		System.out.println("수 입력");
		calculator.setNum2(scanner.nextInt());
		System.out.println("답"+controller.execute(calculator));
		scanner.close();
		
	}
	
}
