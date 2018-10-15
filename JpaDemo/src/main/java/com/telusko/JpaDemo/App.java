package com.telusko.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    /*  Alien a = new Alien();
      a.setAid(7);
      a.setAname("rahul");
      a.setTech("");*/
    
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
/*    	em.getTransaction().begin();
    	em.persist(a);
    	em.getTransaction().commit()*/;
    	
    	Alien a =em.find(Alien.class,7);
    	em.getTransaction().begin();
    	em.remove(a);
    	em.getTransaction().commit();
    	System.out.println(a);
    	
    }
}
