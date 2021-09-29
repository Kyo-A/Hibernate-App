package org.eclipse.entities;

import javax.persistence.Embeddable;

@Embeddable
public class NomComplet {
	private String nom;
	private String prenom;

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

	@Override
	public String toString() {
		return "NomComplet [nom=" + nom + ", prenom=" + prenom + "]";
	}
}
