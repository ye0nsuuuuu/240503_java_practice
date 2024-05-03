package ex_240425;

public class Leeyeonsu_HamsterTest {

	public static void main(String[] args) {
	Leeyeonsu_Hamster hamster1 = new Leeyeonsu_Hamster();
	hamster1.setName("랑이");
	hamster1.setAge(1);
	hamster1.setColor("Brown");
	String[] FoodList = {"해바라기씨","사료","딸기"};
	hamster1.setFavoriteFood(FoodList);
	hamster1.setPlace("케이지");
	
	String hamsterInfo = hamster1.toString();
	System.out.println("햄스터 정보: " +hamsterInfo);
	hamster1.moveAction("뽀짝");
	hamster1.speakSounds("찍찍");
	System.out.println("햄스터가 사는 곳 : " +hamster1.getPlace());
	}
}
