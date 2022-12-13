package projet2;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Joueur {
private String nom;
private String nationalite;
private int numero;


public Joueur(String nom, String nationalite, int numero) {
	super();
	this.nom = nom;
	this.nationalite = nationalite;
	this.numero = numero;
}


public Joueur() {
	super();
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getNationalite() {
	return nationalite;
}


public void setNationalite(String nationalite) {
	this.nationalite = nationalite;
}


public int getNumero() {
	return numero;
}


public void setNumero(int numero) {
	this.numero = numero;
}

}
