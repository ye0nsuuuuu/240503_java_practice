package ex_240424;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int n = scanner.nextInt();
			if (n % 2 == 0) {
				continue;
			} else {
				sum = sum + n;
			}
		}
		System.out.println("sum : " + sum );
	}

}
