package dal.dao;

import dal.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class UserDaoWithJpql implements UserDao {

    @Override
    public void save(UserEntity userEntity) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(userEntity);
    }



    @Override
    public UserEntity findByEmail(String email){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.createQuery("");
        return null;
    }
}

