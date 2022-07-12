package com.example.db;
import com.example.model.UserLogin;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.db.HibernateUtil;
public class LoginDao {
    public boolean validate(String userName, String password) {

        Transaction transaction = null;
        UserLogin user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = (UserLogin) session.createQuery("FROM UserLogin U WHERE U.username = :userName").setParameter("userName", userName)
                    .uniqueResult();

            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }

}

