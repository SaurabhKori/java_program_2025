package design_pattern;

public class NetworkConnectionPrototypeDesignPattern implements Cloneable {
	private String ip;
	private String importantData;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getImportantData() {
		return importantData;
	}

	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}

	public void loadVeryImportanData() throws InterruptedException {
		this.importantData = "Very very important data";
		Thread.sleep(5000);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ip + "  " + this.importantData;
	}
}
