package Util;

import java.util.ArrayList;

import Util.dto.LunchFood;

public class ArrayListUtils {
public static void showArrayList(ArrayList<LunchFood>arrayList) {
	for (int i = 0; i < arrayList.size(); i++) {
		System.out.println("arrayList["+i+"] : " + arrayList.get(i));
	}
}
}
