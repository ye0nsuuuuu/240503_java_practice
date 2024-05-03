package ex_240423;

public class StarCraft_BettleNet_Asia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zerg zerg1 = new Zerg();
		zerg1.setDrone("9드론 생산함");
		zerg1.makeMoney();
		zerg1.patrolDrone();
		String lsyZergStrategy = "이상용씨는 오늘도 주말 새벽아침부터 저그에 온 힘을 다하고 있다";
		zerg1.selectStrategy(lsyZergStrategy);
 
	}

}
