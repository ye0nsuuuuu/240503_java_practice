package ex_240501;

import Util.RandomSelectNumber;
import Util.showArrayString;

public class TestUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = RandomSelectNumber.selectInt(5);
		System.out.println("결과:" + result);
		
		
		String[] todayLunchMenu= {"수제비","칼국수","김밥","라면","쌀쌀국수"};
		showArrayString.show(todayLunchMenu);
		
		
		
	}
	
	
}