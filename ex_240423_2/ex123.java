package ex_240423_2;

// 다른 패키지 기능은 임포트해서 사용하기. 
import java.util.Scanner;

public class ex123 {

	public static void main(String[] args) {
		// 키보드로 입력된 내용을 Scanner 클래스가 변환 해준다. 
		// 사용은, 콘솔에서 특정 문자열, 숫자를 입력받아서, 
		// 임시 메모리에 담아서, 사용할 예정(출력.)
		
		// 사용법 , Scanner 클래스 객체를 생성, A a = new A(System.in);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름이 뭐예요?");
		System.out.println("어디 사나요?");
		System.out.println("취미가 뭐에요?");
		
		
		// scanner: 객체, 수납도구, 읽은 내용을 숫자, 또는 문자열로 변환 해줍니다. 
		String nameString = scanner.next();
		
		String addressString = scanner.next();
		String hobbyString = scanner.next();
		
		
		System.out.println("이름 : " + nameString);
		System.out.println("사는 곳 : " + addressString);
		System.out.println("취미 : " + hobbyString);
		
		// 객체를 사용 후 , 반납. 
		scanner.close();

	}

}
