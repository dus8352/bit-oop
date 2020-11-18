package controller;

public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public int add(CalculatorDTO calculator) {
		return calculator.getNum1() + calculator.getNum2();
	}

	@Override
	public int minus(CalculatorDTO calculator) {
		return calculator.getNum1() - calculator.getNum2();
	}

	@Override
	public int multi(CalculatorDTO calculator) {
		return calculator.getNum1() * calculator.getNum2();
	}

	@Override
	public int divid(CalculatorDTO calculator) {
		return calculator.getNum1() / calculator.getNum2();
	}
	public int modul(CalculatorDTO calculator) {
		return calculator.getNum1() / calculator.getNum2();
	
	}
}