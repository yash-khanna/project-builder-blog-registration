package model;
import java.time.LocalDateTime;

public class User{
	String email;
	String password;
	LocalDateTime date;
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String s) {
		this.email=s;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String s) {
		this.password=s;
	}
	
	public LocalDateTime getDate() {
		return this.date;
	}
	
	public void setDate(LocalDateTime s) {
		this.date=s;
	}
	
	public User(String e,String password,LocalDateTime date) {
		// TODO Auto-generated constructor stub
		this.email=e;this.password=password;this.date=this.date;
	}
}
