 package com.service.user;
 
 import com.dao.user.IUserDao;
 import com.entity.user.User;
 import com.util.StringUtil;
 import org.springframework.stereotype.Service;
 
 @Service
 public class UserServiceImpl implements IUserService
 {
   @org.springframework.beans.factory.annotation.Autowired
   private IUserDao userdao;
   
   public UserServiceImpl() {}
   
   public int lookUser()
   {
     return this.userdao.lookUser();
   }
   
 
 
   public int deleteUser(int id)
   {
     return this.userdao.deleteUser(id);
   }
   
 
 
   public void saveUser(User user)
   {
     this.userdao.saveUser(user);
   }
   
 
 
   public User getUserByUsername(String username)
   {
     return this.userdao.getUserByUsername(username);
   }
   
 
 
   public int userLogin(User user)
   {
     if ((StringUtil.nullValue(user.getUsername()).length() == 0) || (StringUtil.nullValue(user.getPassword()).length() == 0)) {
       return 20003;
     }
     User sysUser = getUserByUsername(user.getUsername());
    if (!user.getPassword().equals(sysUser.getPassword())) {
       return 20002;
     }
     return 0;
   }
 }

/* Location:           E:\workspace\admin\web\WEB-INF\classes
 * Qualified Name:     com.service.user.UserServiceImpl
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */