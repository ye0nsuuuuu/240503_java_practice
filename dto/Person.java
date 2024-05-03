package Util.dto;

public class Person {
	

	public Person(String name, String phoneNumber, String nowTime) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.nowTime = nowTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNowTime() {
		return nowTime;
	}
	public void setNowTime(String nowTime) {
		this.nowTime = nowTime;
	}
	private String name;
	private String phoneNumber;
	private String nowTime;
}
