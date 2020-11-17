package oop;


public class CalculatorDTO {
	int num1;
	int num2;
	int result;
	String Opcode;
	
	String getOpcode() {
		return Opcode;
	}
	public void setOpcode(String opcode) {
		Opcode = opcode;
	}
	int getNum1() {
	
		return num1;
	}
	void setNum1(int num1) {
		this.num1 = num1;
	}
	int getNum2() {
		return num2;
	}
	void setNum2(int num2) {
		this.num2 = num2;
	}
	int getResult() {
		return result;
	}
	void setResult(int result) {
		this.result = result;
	}
}
	