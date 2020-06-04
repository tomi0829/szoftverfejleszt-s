package main.repository;

import main.entity.Szamolas;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    private EntityManager entityManager;

    public Repository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Szamolas szamolas) {
        entityManager.getTransaction().begin();
        entityManager.persist(szamolas);
        entityManager.getTransaction().commit();
    }

    public List<Szamolas> findAll() {
        try {
            Query query = entityManager.createQuery("SELECT sz FROM main.entity.Szamolas sz");
            return query.getResultList();

        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
