package ex_240430_2;

public interface RiceNoodle extends Noodle {
//면류 인터페이스를 상속받은 쌀국수 인터페이스
	public final static String price = "기본 8,000원";
	public abstract void selectNoodleSize(int selectNoodleSizeNumber);
	
}
