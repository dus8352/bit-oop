package viewer;

import java.util.Scanner;

import bmi.*;
import controller.*;
import user.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorDTO calculator = new CalculatorDTO();
		CalculatorController calculatorcontroller = new CalculatorController();
		BmiController bmicontroller = new BmiController();
		BmiDTO bmi = new BmiDTO();
		UserDTO user = new UserDTO();
		System.out.println("0. 종료 1. 계산기 2. BMI ");
		switch(scanner.next()) {
		case "1":
			System.out.println("계산기 시작");
			System.out.println("수 입력");
			calculator.setNum1(scanner.nextInt());
			System.out.println("엽산자입력 +, -, *, /, %");
			calculator.setOpcode(scanner.next());
			System.out.println("수 입력");
			calculator.setNum2(scanner.nextInt());
			System.out.println("답" + calculatorcontroller.execute(calculator));
			break;
		case "2":		
			System.out.println("Bmi 계산 시작");
			System.out.println("이름 입력 : ");
			user.setName(scanner.next());
			System.out.println("키 입력: ");
			bmi.setHeight(scanner.nextDouble());
			System.out.println("몸무게 임력: ");
			bmi.setWeight(scanner.nextDouble());
			System.out.println(bmicontroller.getBmi(user , bmi));
			break;
		case"0":
			System.out.println("시스템 종료");
			break;
		}
		scanner.close();
		
	}

}
