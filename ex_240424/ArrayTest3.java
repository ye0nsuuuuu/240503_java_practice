package ex_240424;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] foodMenu = new String[5];
		System.out.println("메뉴를 입력하세요.");
		for (int i = 0; i < foodMenu.length; i++) {
			foodMenu[i] = scanner.next();
		}
		scanner.close();

		for (int i = 0; i < foodMenu.length; i++) {
			System.out.println("점심메뉴 : " + foodMenu[i] + " ");
		}

	}

}
