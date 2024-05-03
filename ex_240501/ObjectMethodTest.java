package ex_240501;

class Person {
	private String name, email;

	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}

	
	
	
}

public class ObjectMethodTest {

	public static void main(String[] args) {
		Person p1 = new Person("이연수","daram1125@naver.com");
		
		String result = p1.toString();
		System.out.println("결과:" + result);
	}

}
