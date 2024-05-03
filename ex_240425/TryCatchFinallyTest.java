package ex_240425;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력해 주세요.");
		int sum = 0, n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				n = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다 다시 입력해주세요.");
				scanner.next();
				i--;
				continue;
				// TODO: handle exception
			}
			sum+=n;
		}
		System.out.println("합: "+sum);
		scanner.close();
	}

}
