package Util;

import java.util.Vector;

public class CollectionUtils {

	public static void showVectorElem(Vector<String> vectorStrings) {
		for (int i = 0; i < vectorStrings.size(); i++) {
			if(i == 0) {
				System.out.print(vectorStrings.get(i));	
			} else {
				System.out.print(", " + vectorStrings.get(i));	
			}
			
		}
	}
	
	public static void addVectorElem(int wantInt,Vector<String>vector) {
//		vector.setSize(wantInt);
		
		for (int i = 0; i < wantInt; i++) {
			vector.add("더미데이터 이연수:"+i);
		}
	}
	
	
	
	
	
	
}
