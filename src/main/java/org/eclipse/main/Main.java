package org.eclipse.main;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.eclipse.dao.ClientDao;
import org.eclipse.entities.Adresse;
import org.eclipse.entities.Client;
import org.eclipse.entities.Enseignant;
import org.eclipse.entities.Etudiant;
import org.eclipse.entities.NomComplet;
import org.eclipse.entities.Personne;
import org.eclipse.entities.Sport;
import org.eclipse.entities.User;
import org.eclipse.utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class Main {

	public static void main(String[] args) throws Exception {
		
//		Adresse adresse = new Adresse();
//		adresse.setRue("de Marseille");
//		adresse.setCodePostal("13015");
//		adresse.setVille("Marseille");
//		Adresse adresse2 = new Adresse();
//		adresse2.setRue("de Paris");
//		adresse2.setCodePostal("75001");
//		adresse2.setVille("Paris");
		
//		personne.addAdress(adresse);
//		personne.addAdress(adresse2);
		
		/* Personne */
//		Personne personne = new Personne();
//		personne.setNom("Ego");
//		personne.setPrenom("Paul");
//		
//		Enseignant enseignant = new Enseignant();
//		enseignant.setNom("Doe");
//		enseignant.setPrenom("John");
//		enseignant.setSalaire(1000);
//		
//		Etudiant etudiant = new Etudiant();
//		etudiant.setNom("Doe");
//		etudiant.setPrenom("John");
//		etudiant.setNiveau("Master");
		
//		Sport s1 = new Sport();
//		Sport s2 = new Sport();
//		Sport s3 = new Sport();
//		s1.setNom("Football");
//		s1.setType("Collectif");
//		s2.setNom("Rugby");
//		s2.setType("Collectif");
//		s3.setNom("Tennis");
//		s3.setType("Individuel");
		
//		personne.addSport(s1);
//		personne.addSport(s2);
//		
//		personne2.addSport(s3);
//		personne2.addSport(s2);
		
//		User user = new User();
//		NomComplet nComplet = new NomComplet();
//		nComplet.setNom("Doe");
//		nComplet.setPrenom("Pat");
//		user.setNomComplet(nComplet);
//		
//		Configuration configuration = new Configuration().configure();
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		Session session = sessionFactory.openSession();
		
		/* Persistance */

//		Transaction transaction = session.beginTransaction();
//		
//		session.persist(personne);
//		session.persist(enseignant);
//		session.persist(etudiant);
//		
//		session.persist(user);

		
//		

		
//		transaction.commit();
//		session.close();
//		sessionFactory.close();
		
		// creer un objet de configuration
		// .configure() = charger le fichier hibernate.cfg.xml
//		Configuration configuration = new Configuration().configure();
		// Si nous n'avons pas déclaré dans Hibernate.cfg.xml
		// configuration.addAnnotatedClass(Personne.class);
		// Construire l’usine de gestionnaire d’entit e a partir de l’objet de configuration
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
		// Obtenir le gestionnaire d’entite
//		Session session = sessionFactory.openSession();
		// Demarrer une transaction
//		Transaction transaction = session.beginTransaction();
		// Inserer un objet dans la base de donnees
//		session.persist(personne);
		
//		String nom = "Travolta";
//		
//		// Pour recuperer la liste de toutes les personnes
//		Criteria criteria = session.createCriteria(Personne.class);
//		
//		// Pour recuperer une liste de personnes selon un critere
//		criteria = criteria.add(Restrictions.eq("nom", nom));
//		
//		List<Personne> personnes = (List<Personne>) criteria.list();
//		personnes.forEach(System.out::println);
//		
//		CriteriaQuery<Personne> cq = session.getCriteriaBuilder().createQuery(Personne.class);
//		cq.from(Personne.class);
//		List<Personne> personnesList = session.createQuery(cq).getResultList();
//
//		for (Personne p : personnesList) {
//		    System.out.println(p);   
//		}  
		
//		String sqlRequete = "SELECT * FROM Personne WHERE nom = :nom";
//		Query<Personne> query = session.createNativeQuery(sqlRequete);
//		query.setParameter("nom", "Travolta");
//		
//		List<Personne> personnes2 = query.getResultList();
//		personnes2.forEach(System.out::println);   

//		String sqlRequete = "SELECT * FROM Personne WHERE nom = :nom";
//		SQLQuery query = session.createSQLQuery(sqlRequete);
//		query.addEntity(Personne.class);
//		query.setParameter("nom", "Travolta");
//		
//		List<Personne> personnes2 = (List<Personne>) query.list();
//		personnes2.forEach(System.out::println);

		// chercher une personne (avec load)
		// Avec load, Hibernate recupere l’objet de la base de donnees lors de sa premiere utilisation
//		Personne p1 = session.load(Personne.class, 3);
//		System.out.println(p1);
//				
//		p1.setNom("Doe");
//		// Permet de synchroniser l'etat de l'entite avec son etat en db
//		// session.refresh(p1);
//		session.evict(p1);
//		session.flush();

		// Avec get, Hibernate recupere immediatement l’objet de la base de donnees
//		Personne p2 = session.get(Personne.class, 3);
//		System.out.println(p2);	
		
//		p2.setNom("Wick");
//		p2.setPrenom("Pat");
//		// Pour modifier une personne
//		// session.flush();
//		// session.persist(p2);
//		session.save(p2);
		
		// Pour supprimer une personne
//		session.delete(p2);
		
//		Query query = session.getNamedQuery("findByNomPrenom");
//		query.setParameter("nom", "Travolta");
//		query.setParameter("prenom", "John");
//		
//		List<Personne> personnes2 = (List<Personne>) query.list();
//		personnes2.forEach(System.out::println);
//		
//		String hql = "from Personne where nom = :nom";
//		String nom2 = "Travolta";
//		
//		Query query2 = session.createQuery(hql);
//		query2.setParameter("nom", nom2);
		
//		List<Personne> personnes3 = (List<Personne>) query2.list();
//		personnes3.forEach(System.out::println);
		
		// Terminer la transaction et fermer les flux
//		transaction.commit();
//		session.close();
//		sessionFactory.close();
		
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Client c = new Client();
		c.setNom("Pat");
		c.setPrenom("Pot");
		Client c2 = new Client();
		c2.setNom("Wick");
		c2.setPrenom("Pot");
		ClientDao cDao = new ClientDao(session);
		int cle = cDao.save(c);
		cDao.save(c2);
		System.out.println(cle);
		Client c3 = cDao.findById(2);
		c3.setNom("Turing");
		c3.setPrenom("Alan");
		cDao.update(c3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
