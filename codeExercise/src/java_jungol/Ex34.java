package java_jungol;

import java.util.Scanner;

public class Ex34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}