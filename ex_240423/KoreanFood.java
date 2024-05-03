package ex_240423;

import java.security.PublicKey;

public class KoreanFood {
	private String foodName;
	private int foodPrice;
	private String foodPlace;

	private static final String projectName = "오늘 점심 메뉴 선정 프로젝트";

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getFoodPlace() {
		return foodPlace;
	}

	public void setFoodPlace(String foodPlace) {
		this.foodPlace = foodPlace;
	}

	public KoreanFood(String foodName, int foodPrice, String foodPlace) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodPlace = foodPlace;
	}

	public static String showStaticMember() {
		return projectName;
	}	
		
		public void showInfo() {
			System.out.println("오늘 점심 메뉴 : " + this.foodName + ", 가격 : " + this.foodPrice);
			System.out.println("장소 : " + this.foodPlace);}

}
