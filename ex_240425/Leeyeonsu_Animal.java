package ex_240425;

import java.util.Arrays;

public class Leeyeonsu_Animal {
	private String name;
	private int age;
	private String[] favoriteFood;

	
	private String color;

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String[] favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ",color=" + color + ", age=" + age + ", favoriteFood=" + Arrays.toString(favoriteFood) + "]";
	}

	public void speakSounds(String sound) {
		System.out.println("사운드 : " + sound);
	}

	public void moveAction(String action) {
		System.out.println("움직임 : " + action);
	}

}
