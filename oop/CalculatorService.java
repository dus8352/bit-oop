package oop;

public class CalculatorService {
	
	int add(CalculatorDTO calculator) {
		return calculator.getNum1() + calculator.getNum2();
	}
	int minus(CalculatorDTO calculator) {
		return calculator.getNum1() - calculator.getNum2();
	}
	int multi(CalculatorDTO calculator) {
		return calculator.getNum1() * calculator.getNum2();
	}
	int divid(CalculatorDTO calculator) {
		return calculator.getNum1() / calculator.getNum2();
	}
	int modul(CalculatorDTO calculator) {
		return calculator.getNum1() % calculator.getNum2();
	}
		
	
}
