package ex_240425;

public class ArrayRefMethodTest {
	public static String[] makeStringArray() {
		String[] tempStringArray = new String[3];
		for (int i = 0; i < tempStringArray.length; i++) {
			tempStringArray[i] = "먹고싶은 점심메뉴" + i;
		}
		return tempStringArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lunchMenu;
		lunchMenu = makeStringArray();
		for (int i = 0; i < lunchMenu.length; i++) {
			System.out.println("기본값 출력:"+lunchMenu[i]);
		}
		int lunchMenuMemoryAdress=System.identityHashCode(lunchMenu);
		System.out.println("lunchMenu의 메모리 위치 주솟값: "+lunchMenuMemoryAdress);
	}

}
