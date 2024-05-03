package ex_240424;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		System.out.println("가입할 이메일을 입력해주세요. : ");
//		String userEmail = scanner.next();
//		
//		
//
//		System.out.println("가입할 이메일은 : " + userEmail);
//
//		scanner.close();
		
		
		Scanner scanner = new Scanner(System.in);
//		String menu;
		System.out.println("오늘 점심메뉴 무엇을 먹을까요?");
		System.out.println("오늘 날씨가 어떤가요? 1.비 2. 흐림 3.맑음 4.바람 5.기타");
		int number =scanner.nextInt();
		if(number==1) System.out.println("오늘 날씨는 비가오니 삼선우동 추천드려요");
		else if (number==2) System.out.println("오늘 날씨는 흐림이니 밀면 추천드려요");
		else if (number==3) System.out.println("오늘 날씨는 맑음이니 된장찌개 추천드려요");
		else if (number==4) System.out.println("오늘 날씨는 바람이 많이 부니 돼지국밥 추천드려요");
		else System.out.println("기타");
		scanner.close();

		
		
		
		
		
		
		

	}

}
