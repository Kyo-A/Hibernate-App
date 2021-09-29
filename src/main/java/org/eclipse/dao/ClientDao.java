package org.eclipse.dao;

import org.eclipse.entities.Client;
import org.eclipse.entities.Personne;
import org.hibernate.Session;

public class ClientDao extends GenericDao<Client, Integer> {

	public ClientDao(Session session) {
		super(Client.class, session);
	}

}
