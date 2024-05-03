package ex_240426_4;

public class MainPersonTest {

	public static void main(String[] args) {

		Person lsy = new Student();

		Person lcs = new StudentWorker();

		if (lsy instanceof Student) {
			Student lsyStudent = (Student) lsy;
			lsyStudent.study();

			lsy.speak();
		}

	}

}
