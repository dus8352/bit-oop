package bmi;

import user.UserDTO;

public class BmiController {
	public String getBmi(UserDTO user, BmiDTO bmi) {
	return String.format("%s님의 BMI지수는 %f", user.getName(),
			new BmiServiceImpl().calcBmi(bmi));
	}
}
