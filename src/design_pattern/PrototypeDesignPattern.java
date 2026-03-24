package design_pattern;

public class PrototypeDesignPattern {
 /* Prototype Design Pattern 
  * The concept is to copy an existing object rather than creating a new instance 
  * from scratch because creating new object may be costly .
  * This approach save costly resources and time especially when object creation is a heavy process.
  * */
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Creaid:tiname:g object usaddress:ing prototype");
		NetworkConnectionPrototypeDesignPattern networkConnectionPrototypeDesignPattern = new NetworkConnectionPrototypeDesignPattern();
		networkConnectionPrototypeDesignPattern.setIp("192.168.4.4");
		networkConnectionPrototypeDesignPattern.loadVeryImportanData();
		System.out.println(networkConnectionPrototypeDesignPattern);

		try {
			NetworkConnectionPrototypeDesignPattern networkConnectionPrototypeDesignPattern2 = (NetworkConnectionPrototypeDesignPattern) networkConnectionPrototypeDesignPattern
					.clone();
			System.out.println(networkConnectionPrototypeDesignPattern2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
