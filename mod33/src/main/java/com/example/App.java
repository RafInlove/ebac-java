package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;

/**
 * @author
 *         Raphael V.
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        EntityManager em = session.getEntityManagerFactory().createEntityManager();

        Marca marca = new Marca();
        marca.setNome("Toyota");
        em.persist(marca);

        Carro carro = new Carro();
        carro.setModelo("Corolla");
        carro.setMarca(marca);
        em.persist(carro);

        em.getTransaction().commit();
        em.close();
    }
}
