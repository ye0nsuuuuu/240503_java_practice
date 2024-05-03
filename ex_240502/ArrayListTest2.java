package ex_240502;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		// 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next(); // 키보드로부터 이름 입력
			a.add(s); // ArrayList 컬렉션에 삽입
		}
		// ArrayList에 들어 있는 모든 이름 출력
		for (int i = 0; i < a.size(); i++) {
			// ArrayList의 i 번째 문자열 얻어오기
			String name = a.get(i);
			System.out.print(name + " ");// 가장 긴 이름 출력
			int longestIndex = 0;
			for (int i1 = 1; i1 < a.size(); i1++) {
				if (a.get(longestIndex).length() < a.get(i1).length())
					longestIndex = i1;
			}
			System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
			
			ArrayList<Integer> intArrayList= new ArrayList<Integer>();
			intArrayList.add(100);
			intArrayList.add(200);
			intArrayList.add(300);
			intArrayList.add(400);
			 
			Iterator<Integer> iterator = intArrayList.iterator();
			while (iterator.hasNext()) {
				Integer integer = (Integer) iterator.next();
				System.out.println(integer);
				
			}
			
		}
	}
}