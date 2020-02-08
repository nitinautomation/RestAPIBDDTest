package io.restassured.payload;
//POJO plain ob
public class RegisterUser {

	String FirstName;
	String LastName;
	String UserName;
	String Password;
	String Email;
	
	public RegisterUser() {
		
	}
	
//	public RegisterUser(String FirstName,String LastName, String UserName, String Password, String Email) {
//		// TODO Auto-generated constructor stub
//		this.FirstName = FirstName;
//		this.LastName = LastName;
//		this.UserName = UserName;
//		this.Password = Password;
//		this.Email = Email;
//	
//	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}
	
	 public String toString() {
	        return "My name is a " + this.FirstName + " " + this.LastName + " " + this.UserName+""+this.Password+" "+this.Email;
	    }
	
	
	
}
