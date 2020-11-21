package interfaceEx2;

public class CompleteCalc implements Calc {
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public int substract(int num1, int num2) {
		return num1- num2;
	}
	public int time(int num1, int num2) {
		return num1+num2;
	}
	public int divide(int num1, int num2) {
		if (num2 !=0)
			return num1/num2;
		else
			return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현 하였습니다");
	}
}
