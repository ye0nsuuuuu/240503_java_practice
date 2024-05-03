package ex_240503;

class ThreadTest2 extends Thread{
int n = 0;

@Override
public void run() {

super.run();
while (true) {
	System.out.println("숫자 카운트 스레드2 : " + n );
	n++;
	try {
		sleep(1000);
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}

class ThreadTest3 extends Thread{
int n = 0;

@Override
public void run() {

super.run();
while (true) {
	System.out.println("숫자 카운트 스레드3 : " + n );
	n++;
	try {
		sleep(1000);
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}


class ThreadTest4 extends Thread{
int n = 0;

@Override
public void run() {

super.run();
while (true) {
	System.out.println("숫자 카운트 스레드4 : " + n );
	n++;
	try {
		sleep(1000);
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}



public class ThreadTest1 extends Thread{

	int n = 0;
	
	@Override
public void run() {
	
	super.run();
	while (true) {
		System.out.println("숫자 카운트 스레드1 : " + n );
		n++;
		try {
			sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
	public static void main(String[] args) {
	
		ThreadTest1 threadTest1 = new ThreadTest1();
		ThreadTest2 threadTest2 = new ThreadTest2();
		ThreadTest3 threadTest3 = new ThreadTest3();
		ThreadTest4 threadTest4 = new ThreadTest4();
		
		
		threadTest1.start();
		threadTest2.start();
		threadTest3.start();
		threadTest4.start();
		
		
	}

}
