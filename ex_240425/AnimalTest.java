package ex_240425;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setName("다람이");
		cat1.setAge(15);
		String[] catFoodList = { "츄르","참치캔","생선"};
		cat1.setFavoriteFood(catFoodList);
	    cat1.setPlace("우리집");
	    
	    String catInfo = cat1.toString();
	    System.out.println("고양이 정보 : "+catInfo);
	    cat1.moveAction("우다다");
	    cat1.speakSounds("야옹");
	    System.out.println("고양이가 사는 곳 : "+cat1.getPlace());
	    
	    
	    
	}

}
