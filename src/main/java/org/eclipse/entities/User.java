package org.eclipse.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;

	private NomComplet nomComplet;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public NomComplet getNomComplet() {
		return nomComplet;
	}

	public void setNomComplet(NomComplet nomComplet) {
		this.nomComplet = nomComplet;
	}
}
