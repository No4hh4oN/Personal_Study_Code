package java_book;

public class Ex26 {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " +calculator.areaCircle(r));
		
		Computer computer = new Computer();
		System.out.println("원면적 : "+computer.areaCircle(r));
	}
}

class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159*r*r;
	}
}

class Computer extends Calculator {
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}