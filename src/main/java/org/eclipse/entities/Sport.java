package org.eclipse.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sport {
	@Id
	private String nom;
	private String type;
	
	@ManyToMany(mappedBy="sports")
	private List<Personne> personnes = new ArrayList<Personne>();

	public Sport() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public void addPersonne(Personne p) {
		personnes.add(p);
		p.getSports().add(this);
	}

	public void removePersonne(Personne p) {
		personnes.remove(p);
		p.getSports().remove(this);
		
	}

	
}
