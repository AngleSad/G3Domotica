package bean;

import java.io.Serializable;
import java.util.Objects;

public class users implements Serializable {
	private String user;
	private String pass;
	private String erabil;
	//Eraikitzaileak
	public users(){
		user="";
		pass="";
		erabil="";
	}
	public users(String u,String p,String e){
		user=u;
		pass=p;
		erabil=e;
	}

	//Getters and Setters
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getErabil() {
		return erabil;
	}
	public void setErabil(String erabil) {
		this.erabil = erabil;
	}
	//hashCode
	@Override
	public int hashCode() {
		return Objects.hash(user);
	}
	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		users other = (users) obj;
		return Objects.equals(user, other.user);
	}
	
}
