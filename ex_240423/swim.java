package ex_240423;

public class swim {
private String sportsName;
private String sportsMember;
private String sportsSeason;

private static final String swimmingStyle="출력해봐";
	


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

public void butterfly() {
	System.out.println("접영");
}

public void frog() {
	System.out.println("평영");
}

public void freeStyle() {
	System.out.println("자유형");
}
@Override
public String toString() {
	return "swim [sportsName=" + sportsName + ", sportsMember=" + sportsMember + ", sportsSeason=" + sportsSeason + "]";
}

public static String swimmingStyle() {
	return swimmingStyle;
} 

}
