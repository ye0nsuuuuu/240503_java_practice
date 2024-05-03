package ex_240423_2;

import ex_240423.Hello;
import ex_240423.KoreanFood;
import ex_240423.Zerg;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		result = Hello.sum(10, 20);
		System.out.println("result:" + result);

		
		KoreanFood porkSoup= new KoreanFood("섞어국밥", 9500, "밀양돼지국밥");
	    Zerg zerg1 = new Zerg();
	    
	    
	    Zerg zerg2 = new Zerg("드론9마리","저글링4마리","히드라12마리");
	    
	    
	    System.out.println("zerg1 객체 바로 출력"+zerg1);
	    
	    
	}

}
