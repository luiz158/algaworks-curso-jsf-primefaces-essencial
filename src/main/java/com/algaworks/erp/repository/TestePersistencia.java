package com.algaworks.erp.repository;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.erp.model.Teste;

public class TestePersistencia {
    
    public static void main(String[] args) {       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlgaWorksPU");
        EntityManager em = emf.createEntityManager();
        
        //Teste teste = new Teste(new Date());
        Teste teste = new Teste(new GregorianCalendar());
        
        em.getTransaction().begin();
        
        em.merge(teste);
        
        em.getTransaction().commit();
        
        System.out.println(em.createQuery("from Teste").getResultList());
        
        em.close();
        emf.close();
    }
}
