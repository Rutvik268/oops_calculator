package rutvik.oops_calculator;

public class Calculator {
	int num1, num2;

	Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	int add() {
		return num1 + num2;
	}

	int sub() {
		return num1 - num2;
	}

	int mul() {
		return num1 * num2;
	}

	int div() {
		return num1 / num2;
	}

}
