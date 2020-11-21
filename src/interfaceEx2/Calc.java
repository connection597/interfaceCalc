package interfaceEx2;

public interface Calc {
	
	int ERROR = 0;

	default void description() {
		System.out.println("정수 계산기를 구현합니다");
		myMethod();
	}
	
		static int total(int[] arr) {
		int total = 0;
		for (int i :arr) {
			total +=i;
		}
		myStaticMethod();
		return total;
	}
	private static void myStaticMethod() {
		System.out.println("private static 메서드 입니다");
		
	}
	private void myMethod() {
		System.out.println("private메서드 입니다");
	}

}
