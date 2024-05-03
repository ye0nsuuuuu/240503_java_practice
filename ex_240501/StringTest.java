package ex_240501;

public class StringTest {

	public static void main(String[] args) {
	String java ="java";
	String bus = "bus";
	String energy = "energy";
	int javaCompareBus=java.compareTo(bus);
	System.out.println("javaCompareBus:"+javaCompareBus);

	int BusComparejava=bus.compareTo(java);
	System.out.println("BusComparejava:"+BusComparejava);
	
	int BusCompareBus=bus.compareTo(bus);
	System.out.println("BusCompareBus:"+BusCompareBus);
	
	int energyCompareBus=energy.compareTo(bus);
	System.out.println("energyCompareBus:"+energyCompareBus);
	
	int resultBusAddr=System.identityHashCode(bus);
	System.out.println("resultBusAddr:"+resultBusAddr);
	
	int resultjavaAddr=System.identityHashCode(java);
	System.out.println("resultjavaAddr:"+resultjavaAddr);
	
	String busConcatJavaString= bus.concat(java);
	System.out.println("busConcatJavaString:"+busConcatJavaString);
	
	int resultBusJavaAddr=System.identityHashCode(busConcatJavaString);
	System.out.println("resultBusJavaAddr:"+resultBusJavaAddr);
	
	StringBuffer stringBufferJava = new StringBuffer("java");
	System.out.println("stringBufferJava:"+stringBufferJava);
	
	
	
	}

}
