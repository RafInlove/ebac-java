package com.example.mod32;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Produto.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            Produto produto = new Produto();
            produto.setNome("Produto Exemplo");
            produto.setPreco(100.00);
            produto.setQuantidade(10);

            session.beginTransaction();
            session.save(produto);
            session.getTransaction().commit();

            System.out.println("Produto salvo com sucesso!");
        } finally {
            factory.close();
        }
    }
}
