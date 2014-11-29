 package com.dao.user;
 
 import com.conmmon.BaseDao;
 import com.entity.user.User;
 import java.util.List;
 import org.hibernate.Query;
 import org.hibernate.Session;
 import org.springframework.stereotype.Repository;
 
 
 @Repository
 public class UserDaoImpl
   extends BaseDao
   implements IUserDao
 {
   public UserDaoImpl() {}
   
   public int lookUser()
   {
     Query query = getCurrentSession().createQuery("FROM User");
     List<?> l = query.list();
     return l.size();
   }
   
 
 
 
   public int deleteUser(int id)
   {
     Query query = getCurrentSession().createSQLQuery("DELETE  FROM t_user where id = " + id);
     return query.executeUpdate();
   }
   
 
 
 
   public void saveUser(User user)
   {
     getCurrentSession().save(user);
   }
   
   public User getUserByUsername(String username) {
     Query query = getCurrentSession().createQuery("FROM User");
     List<?> l = query.list();
     if ((l == null) || (l.size() != 1)) {
       return null;
     }
     return (User)l.get(0);
   }
 }

/* Location:           E:\workspace\admin\web\WEB-INF\classes
 * Qualified Name:     com.dao.user.UserDaoImpl
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */