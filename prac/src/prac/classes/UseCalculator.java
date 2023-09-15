package prac.classes;

import java.util.Scanner;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int num1 = 2;
		int num2 = 10;
		
		int sumAdd = cal.add(num1, num2);
		int sumSub = cal.sub(num1, num2);
		int sumMul = cal.mul(num1, num2);
		int sumDiv = cal.div(num1, num2);
		
		System.out.println("두 수의 합: " + sumAdd);
		System.out.println("두 수의 빼기: " + sumSub);
		System.out.println("두 수의 곱: " + sumMul);
		System.out.println("두 수의 나누기: " + sumDiv);
		
		////////////
		
//		Scanner scan = new Scanner(System.in);
//		int num3 = 
//		
//		Calculator cal2 = new Calculator();
//		
		
		
		
		
	}

}
