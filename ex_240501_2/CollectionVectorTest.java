package ex_240501_2;

import java.nio.channels.NonWritableChannelException;
import java.util.Collection;
import java.util.Vector;

import Util.CollectionUtils;

public class CollectionVectorTest {

	public static void main(String[] args) {
		String[] array = new String[3];

		Vector<String> vectorStrings = new Vector<String>();
		System.out.println("Vector의 기본용량 알아보기:" + vectorStrings.capacity());

		vectorStrings.add("초밥");
		CollectionUtils.showVectorElem(vectorStrings);
		System.out.println("==================");

		vectorStrings.add("도시락 소불고기 덮밥");
		CollectionUtils.showVectorElem(vectorStrings);
		vectorStrings.remove(0);
		System.out.println();
		System.out.println("==================");
		CollectionUtils.showVectorElem(vectorStrings);
		
		
		CollectionUtils.addVectorElem(2, vectorStrings);
		System.out.println();
		System.out.println("==================");
		CollectionUtils.showVectorElem(vectorStrings);
		
		
		System.out.println();
		System.out.println("========================================");
		CollectionUtils.showVectorElem(vectorStrings);
		System.out.println();
		System.out.println("Vector의 기본 용량 알아보기 vectorStrings.capacity() : " + vectorStrings.capacity());

		// 추가 넣기.
		// 원하는 갯수 만큼 더미데이터 넣기 반복문으로.
		CollectionUtils.addVectorElem(2, vectorStrings);

		// 출력 확인.
		System.out.println();
		System.out.println("========================================");
		CollectionUtils.showVectorElem(vectorStrings);
		System.out.println();
		System.out.println("Vector의 기본 용량 알아보기 vectorStrings.capacity() : " + vectorStrings.capacity());
		
		
		Vector<Integer> vectorIntegers = new Vector<Integer>();
		vectorIntegers.add(Integer.valueOf(30));
		vectorIntegers.add(30);
		
		CollectionUtils.showVectorElem(vectorStrings);
		
		
		
		
		
		
	
	
	
	}

}
