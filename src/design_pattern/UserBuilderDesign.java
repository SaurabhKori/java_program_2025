package design_pattern;

public class UserBuilderDesign {
	private final String userId;
	private final String userName;
	private final String emailId;

	private UserBuilderDesign(UserBuilder builder) {
		this.userId = builder.userId;
		this.emailId = builder.emailId;
		this.userName = builder.userName;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmailId() {
		return emailId;
	}

	// inner class to create
	static class UserBuilder {
		private String userId;
		private String userName;
		private String emailId;

		public UserBuilder() {

		}

		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}

		public UserBuilderDesign build() {
			UserBuilderDesign user = new UserBuilderDesign(this);
			return user;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.emailId + "" + userId + userName;
	}
}
