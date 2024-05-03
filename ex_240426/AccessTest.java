package ex_240426;

class Sample {
	public int a;
	private int b=100;
	int c;

	public int getB() {
		return b;
	}

static int tvChannel=3;
public static void channelUp() {
tvChannel++;	
}
public static void channelDown() {
tvChannel--;	
}



}




public class AccessTest {

	public static void main(String[] args) {
		Sample sample = new Sample();
		int result = sample.getB();
		System.out.println("result : " + result);

		
		sample.a = 200;
		System.out.println("sample a 의 값 : "+sample.a);
		
		
		
		Sample lsy = new Sample();
		Sample krk = new Sample();
		Sample hsj = new Sample();
		
		System.out.println("선생님이 티비를 " + lsy.tvChannel + "번 채널 시청중");
		System.out.println("강루키가 UFC를 보고 싶어서 채널을 1 올렸음");
		krk.channelUp();
		System.out.println("선생님과 강루키,홍사자는 같이 "+ lsy.tvChannel +"번 채널 시청중");
	}

}
