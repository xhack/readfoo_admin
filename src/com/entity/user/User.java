 package com.entity.user;
 
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.Id;
 import org.hibernate.annotations.GenericGenerator;
 
 
 
 
 
 
 
 
 
 
 
 @Entity
 public class User
 {
   @Id
   @GeneratedValue(generator="idGenerator")
   @GenericGenerator(name="idGenerator", strategy="uuid")
   private String id;
   private String username;
   private String password;
   
   public User() {}
   
   public String getId()
   {
     return this.id;
   }
   
   public void setId(String id) { this.id = id; }
   
   public String getUsername() {
     return this.username;
   }
   
   public void setUsername(String username) { this.username = username; }
   
   public String getPassword() {
     return this.password;
   }
   
   public void setPassword(String password) { this.password = password; }
 }

/* Location:           E:\workspace\admin\web\WEB-INF\classes
 * Qualified Name:     com.entity.user.User
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */