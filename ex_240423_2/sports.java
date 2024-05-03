package ex_240423_2;

import ex_240423.Swimming;

public class sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Swimming swim1 =new Swimming();
swim1.setSportsMember("이연수");
swim1.setSportsName("수영");
swim1.setSportsSeason("하계");

swim1.showInfo();

System.out.println(Swimming.Comment);

	}

}
