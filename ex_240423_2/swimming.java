package ex_240423_2;

public class swimming {
	
    private String sportsName;
	private String sportsMember;
	private String sportsSeason;
	
	public static final String COMMENT="새벽수영 재미있다";
	
	public static void showComment() {
		System.out.println("궁시렁");
	}
	
	
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public String getSportsMember() {
		return sportsMember;
	}
	public void setSportsMember(String sportsMember) {
		this.sportsMember = sportsMember;
	}
	public String getSportsSeason() {
		return sportsSeason;
	}
	public void setSportsSeason(String sportsSeason) {
		this.sportsSeason = sportsSeason;
	}
	
	public void showInfo() {
		System.out.println("sportsName:"+"sportsMember:"+"sportsSeason:");
		
	}
	@Override
	public String toString() {
		return "swimming [sportsName=" + sportsName + ", sportsMember=" + sportsMember + ", sportsSeason="
				+ sportsSeason + "]";
	}
	
}
