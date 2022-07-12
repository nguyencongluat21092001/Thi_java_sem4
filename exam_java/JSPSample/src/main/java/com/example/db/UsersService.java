package com.example.db;

import com.example.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsersService {

    public void findUser(String username, String password) {
        Transaction transaction = null;
        User user;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            user = session.get(User.class, username);
            session.flush();
            // commit transaction
            transaction.commit();
            if (user != null) {
                if (user.getPassword() == password) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}