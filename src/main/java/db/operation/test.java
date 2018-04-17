package db.operation;

import db.models.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class test {
    public static void main(String[] args){
        UserEntity user = new UserEntity();
        user.setId(1);
        user.setName("Hans");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }
}
