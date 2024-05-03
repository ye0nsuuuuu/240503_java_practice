package ex_240502_mini;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import Util.LocalDateTimeMake;
import Util.RandomSelectNumber;
import Util.dto.LunchFood;
import Util.dto.Person;

public class MiniPhoneBook {

	public static void phoneNumber(Scanner scanner, HashMap<String, Person> hashMap) {
		while (true) {
			System.out.println("=================================");
			System.out.println("연락처");
			System.out.println("1. 연락처 입력, 2. 연락처 출력, 3. 연락처 검색하기 , 4. 연락처 삭제하기. , 5. 연락처 랜덤뽑기., 6. 종료하기. ");
			System.out.println("=================================");

			// 순서2-2, 문자열로 날씨를 담을 변수 지정.
			String phoneBook = scanner.next();

			if (phoneBook.equals("6")) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			} else if (phoneBook.equals("1")) {
				System.out.println("이름 입력>>");
				String userName = scanner.next();
				System.out.println("연락처 입력>>");
				String numberList = scanner.next();

				String nowTime = LocalDateTimeMake.now();

				Person person = new Person(userName, numberList, nowTime);
				hashMap.put(userName, person);
				continue;
			} else if (phoneBook.equals("2")) {
				System.out.println("연락처 출력>>");
				Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
				Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴

				while (it.hasNext()) {
					String key = it.next(); // 키
					Person value = hashMap.get(key); // 값
					System.out.print("[" + key + "," + value.getPhoneNumber() + "(" + value.getNowTime() + ")" + "]");
				}

				continue;
			} else if (phoneBook.equals("3")) {
				System.out.println("검색하기>>");
				String searchName = scanner.next();
				Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
				Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
				
				while (it.hasNext()) {
					String key = it.next(); // 키
					Person value = hashMap.get(key); // 값
					if (key.equals(searchName)) {
						System.out.println(
								"[" + key + "," + value.getPhoneNumber() + "(" + value.getNowTime() + ")" + "]");
					} 
				}
				if(keys.isEmpty()) {
					System.out.println("결과없음");
				}
				continue;
			}

			else if (phoneBook.equals("4")) {
				System.out.println("연락처 삭제하기 예:이름입력 이연수>>");
				String deleteName = scanner.next();
				Set<String> keys = hashMap.keySet(); // 모든 키를 Set 컬렉션에 받아옴
				Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
				while (it.hasNext()) {
					String key = it.next(); // 키
					Person value = hashMap.get(key); // 값
					if (key.equals(deleteName)) {
						hashMap.remove(key);
						System.out.println("삭제완료");
						break;
					}

				}
			}
			 else if (phoneBook.equals("5")) {
				System.out.println("랜덤뽑기");
				ArrayList<String> randomList = new ArrayList<String>(hashMap.keySet());
				int result = RandomSelectNumber.selectInt(hashMap.size());
				
				//키에 따른 값도 가져올게
				String randomkey = randomList.get(result);
				
				Person value = hashMap.get(randomkey); // 값
				
				System.out.println(value.getName()+value.getPhoneNumber()+value.getNowTime());
				continue;
			}
			else {
				System.out.println("1~5까지만 입력하세요");
			}
		}
	}

	public static void main(String[] args) {

		HashMap<String, Person> hashMap = new HashMap<String, Person>();

		Scanner scanner = new Scanner(System.in);

		phoneNumber(scanner, hashMap);

	}
}
