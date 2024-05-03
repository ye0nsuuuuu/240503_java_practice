package ex_240424;

import java.util.Scanner;

public class switchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("오늘 점심메뉴 무엇을 먹을까요?");
		System.out.println("오늘 날씨가 어떤가요? 1.비 2. 흐림 3.맑음 4.바람 5.기타");
		int number =scanner.nextInt();
		switch(number) {
		case 1 : System.out.println("오늘 날씨는 비가오니 삼선우동 추천드려요");
		break;
		case 2 : System.out.println("오늘 날씨는 흐림이니 밀면 추천드려요");
		break;
		case 3 : System.out.println("오늘 날씨는 맑음이니 된장찌개 추천드려요");
		break;
		case 4 : System.out.println("오늘 날씨는 바람이 많이 부니 돼지국밥 추천드려요");
		break;
		default : System.out.println("잘못된 입력입니다.");
		}
		scanner.close();
	}

}
