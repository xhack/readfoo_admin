 package com.test;
 
 import com.entity.user.User;
 import com.service.user.IUserService;
 import org.junit.Test;
 import org.junit.runner.RunWith;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.test.context.ContextConfiguration;
 import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 import org.springframework.test.context.transaction.TransactionConfiguration;
 import org.springframework.transaction.annotation.Transactional;
 
 
 @RunWith(SpringJUnit4ClassRunner.class)
 @ContextConfiguration(locations={"classpath:spring-system-config.xml"})
 @Transactional
 @TransactionConfiguration(transactionManager="H4TxManager", defaultRollback=false)
 public class AppTest
 {
   @Autowired
   private IUserService userService;
   
   public AppTest() {}
   
   @Test
   public void testService()
   {
     org.springframework.util.Assert.notNull(this.userService);
   }
   
   @Test
   public void addUser() {
     int num = this.userService.lookUser();
     this.userService.saveUser(newUser());
     junit.framework.Assert.assertEquals(this.userService.lookUser(), num + 1);
   }
   
   public User newUser()
   {
     User u = new User();
    u.setUsername("test");
     u.setPassword("pwd");
     return u;
   }
 }

/* Location:           E:\workspace\admin\web\WEB-INF\classes
 * Qualified Name:     com.test.AppTest
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */