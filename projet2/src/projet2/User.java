package projet2;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class User {
	
	private String name = "";
	private String lastname="";
	private boolean  majeur= false;
	private String sexe;

	public User() {
	}
	public User(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	  public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean isMajeur() {
		return majeur;
	}
	public void setMajeur(boolean majeur) {
		this.majeur = majeur;
	}
	
	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", majeur=" + majeur + "]";
	}

	
	
	
	
	
	
	
	
	

}
