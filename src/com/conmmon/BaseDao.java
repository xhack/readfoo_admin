 package com.conmmon;
 
 import org.hibernate.SessionFactory;
 
 public class BaseDao {
   @org.springframework.beans.factory.annotation.Autowired
   private SessionFactory sessionFactory;
   
   public BaseDao() {}
   
   public org.hibernate.Session getCurrentSession() {
    return this.sessionFactory.getCurrentSession();
   }
 }

/* Location:           E:\workspace\admin\web\WEB-INF\classes
 * Qualified Name:     com.conmmon.BaseDao
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */