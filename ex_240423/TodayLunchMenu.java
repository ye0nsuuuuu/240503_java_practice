package ex_240423;

public class TodayLunchMenu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 시작");
		
		KoreanFood bibimbap = new KoreanFood("비빔밥",9000,"본죽비빔밥");
		KoreanFood bulgogi = new KoreanFood("불고기",7500,"태산");
		KoreanFood dolsot = new KoreanFood("돌솥",7500,"우정");
		
		System.out.println("오늘 점심 메뉴 :"+bibimbap.getFoodName());
		System.out.println("오늘 점심 가격 :" + bibimbap.getFoodPrice()+"원");
		System.out.println("오늘 점심 장소 :"+bibimbap.getFoodPlace());
		
		
		String test = KoreanFood.showStaticMember();
		System.out.println("test 변수에 담긴 내용 출력 : "+test);
		
		int result = Hello.sum(1000,2000);
		System.out.println("Hello 클래스 안에 함수 실행 결과 : "+result);
		
		
	}

}
