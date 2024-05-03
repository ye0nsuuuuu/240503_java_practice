package ex_240423;

public class Zerg {

	private String drone;
	private String zergling;
	private String hydra;

	public String getDrone() {
		return drone;
	}

	public void setDrone(String drone) {
		this.drone = drone;
	}

	public String getZergling() {
		return zergling;
	}

	public void setZergling(String zergling) {
		this.zergling = zergling;
	}

	public String getHydra() {
		return hydra;
	}

	public void setHydra(String hydra) {
		this.hydra = hydra;
	}

	public void makeMoney() {
		System.out.println("드론으로 미네랄,가스 같이 채취하기.");
	}

	public void patrolDrone() {
		System.out.println("드론으로 스타팅 포인트로 정찰 보내기 매우중요!");
	}

	public void selectStrategy(String strategy) {
		System.out.println("내가 선택한 전략 : "+strategy);
	}

	public Zerg(String drone, String zergling, String hydra) {
		super();
		this.drone = drone;
		this.zergling = zergling;
		this.hydra = hydra;
	}

	public Zerg() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Zerg [drone=" + drone + ", zergling=" + zergling + ", hydra=" + hydra + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
