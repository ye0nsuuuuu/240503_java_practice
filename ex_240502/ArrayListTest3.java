package ex_240502;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest3 {

	public static void main(String[] args) {
					
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
				// Iterator를 이용하여 모든 정수 더하기
//				int sum = 0;
//				iterator = v.iterator(); // Iterator 객체 얻기
//				while(iterator.hasNext()) {
//				int n = iterator.next();
//				System.out.println("n값이 들어있니?"+n);
				sum += integer; 
				}
				System.out.println("벡터에 있는 정수 합 : " + sum);

				
			}
			
		}
	
