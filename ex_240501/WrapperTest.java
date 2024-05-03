package ex_240501;

public class WrapperTest {

	public static void main(String[] args) {
		Integer integer = Integer.valueOf(31);
		Integer bitCountResult = integer.bitCount(7);
		System.out.println("결과:"+bitCountResult);
		
		int refTointResult=integer.intValue();
		System.out.println("refTointResult:"+refTointResult);
	
		
		int stringTointResult=integer.parseInt("1234");
		System.out.println("stringTointResult:"+stringTointResult);
		
		int intToBinaryResult=integer.parseInt("31",8);
		System.out.println("intToBinaryResult:"+intToBinaryResult);
	}

}
