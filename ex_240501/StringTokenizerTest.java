package ex_240501;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String query = "메뉴=도시락&가격=10,000원&장소=4층휴게실";
		StringTokenizer st = new StringTokenizer(query, "&");
		int n = st.countTokens(); // 분리된 토큰 개수
		System.out.println("토큰 개수 = " + n);
		while (st.hasMoreTokens()) {
			String token = st.nextToken(); // 토큰 얻기
			System.out.println(token); // 토큰 출력
		}
	}
}
