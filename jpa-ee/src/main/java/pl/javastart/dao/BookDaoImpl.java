package pl.javastart.dao;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import pl.javastart.model.Book;

@RequestScoped
public class BookDaoImpl implements BookDao {

    @PersistenceUnit(name = "asdf")
    private EntityManagerFactory emFactory;

    @Override
    public void save(Book book) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(book);
        tx.commit();
        em.close();
    }

    @Override
    public Book get(Long id) {
        EntityManager em = emFactory.createEntityManager();
        Book book = em.find(Book.class, id);
        em.close();
        return book;
    }

    @Override
    public void remove(Long bookId) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Book objToRemove = em.find(Book.class, bookId);
        tx.begin();
        em.remove(objToRemove);
        tx.commit();
        em.close();
        System.out.println(objToRemove.getId());
    }

    @Override
    public void update(Book book) {
        EntityManager em = emFactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(book);
        tx.commit();
        em.close();
    }
}