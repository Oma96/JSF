package projet2;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Equipe {
private String nom="";
private String pays;
private int nbrJoueur;
private int nbrBut;
private ArrayList<Joueur> joueurs= new ArrayList<>();



public Equipe() {
addJoueur(new Joueur("j1","tun",1));	
addJoueur(new Joueur("j2","fr",2));	
addJoueur(new Joueur("j3","be",3));	
addJoueur(new Joueur("j4","ar",4));	
}
public Equipe(String nom, String pays, int nbrJoueur, int nbrBut) {
	super();
	this.nom = nom;
	this.pays = pays;
	this.nbrJoueur = nbrJoueur;
	this.nbrBut = nbrBut;
	this.joueurs= joueurs;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPays() {
	return pays;
}
public void setPays(String pays) {
	this.pays = pays;
}
public int getNbrJoueur() {
	return nbrJoueur;
}
public void setNbrJoueur(int nbrJoueur) {
	this.nbrJoueur = nbrJoueur;
}
public int getNbrBut() {
	return nbrBut;
}
public void setNbrBut(int nbrBut) {
	this.nbrBut = nbrBut;
}
public ArrayList<Joueur> getJoueurs() {
	return joueurs;
}
public void setJoueurs(ArrayList<Joueur> joueurs) {
	this.joueurs = joueurs;
}
public void addJoueur(Joueur joueur) {
	this.joueurs.add(joueur);
}

}
