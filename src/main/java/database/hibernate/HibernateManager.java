package database.hibernate;

import document.entity.Document;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import people.entity.People;

public class HibernateManager {
    private static final HibernateManager instance;
    private final SessionFactory sessionFactory;

    static {
        instance = new HibernateManager();
    }

    public static HibernateManager getInstance() {
        return instance;
    }

    private HibernateManager() {
        Configuration conf = new Configuration()
                .addAnnotatedClass(People.class)
                .addAnnotatedClass(Document.class)
                .configure();

        this.sessionFactory = conf.buildSessionFactory();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public Session openNewSession(){
        return sessionFactory.openSession();
    }
}

