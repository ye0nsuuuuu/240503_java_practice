package ex_240430_2;

public interface Noodle {
//면류, 
	public final static String NOODLENAME = "면류 음식";

	public abstract void boiledNoodle(String boiledTime);
	public abstract void addTopping(String[]ToppingSouces); 
	public abstract void makeSoup(String [] SoupSouces);
	public abstract void makeSource(String[]Souces);
	
}
