package org.eclipse.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_PERSONNE")
@DiscriminatorValue(value = "PERS")
//@NamedQuery(name = "findByNomPrenom", query = "SELECT p FROM Personne p WHERE p.nom = :nom AND p.prenom = :prenom")
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer num;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;

//	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
//	@JoinColumn(name = "rue", referencedColumnName = "rue", nullable = false)
//	private Adresse adresse;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE }, fetch = FetchType.EAGER)
	@Fetch(FetchMode.SELECT)
	private List<Adresse> adresses = new ArrayList<Adresse>();

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private List<Sport> sports = new ArrayList<Sport>();

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

//	public Adresse getAdresse() {
//		return adresse;
//	}
//
//	public void setAdresse(Adresse adresse) {
//		this.adresse = adresse;
//	}

	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	public boolean addAdress(Adresse e) {
		return adresses.add(e);
	}

	public boolean removeAdress(Adresse e) {
		return adresses.remove(e);
	}

	public List<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public List<Sport> getSports() {
		return sports;
	}

	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}

	public void addSport(Sport s) {
		sports.add(s);
		s.getPersonnes().add(this);
	}

	public void removeSport(Sport s) {
		sports.remove(s);
		s.getPersonnes().remove(this);

	}

}
