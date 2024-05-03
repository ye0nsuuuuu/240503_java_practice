package ex_240430;

import java.util.Scanner;

import ex_240423.TodayLunchMenu;
import ex_240424.TodayPickLunchWithWeatherWhile3;

class Parent{
	public String parentName;
	
	public void makeNoodle() {
		System.out.println("부모님 레시피로 국수 만들기");
	}
}
class Child extends Parent{
	public String childName;
	
	public void makeNoodle() {
		System.out.println("내 레시피로 국수 만들기");
		super.parentName = "부모님 국수 이름 테스트";
		super.makeNoodle();
	}
}

public class SuperAccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p1 = new Child();
		Child c1 =(Child) p1;
		
		c1.makeNoodle();
//		Scanner scanner = new Scanner(System.in);
//		TodayPickLunchWithWeatherWhile3.recommendFood(scanner);
		
		
		System.out.println("c1.parentName : "+c1.parentName);
		
	}

}
