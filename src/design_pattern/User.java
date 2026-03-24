package design_pattern;

public class User {
	private String name;

	private String userid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public User(String name, String userid) {

		this.name = name;
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", userid=" + userid + "]";
	}

}
