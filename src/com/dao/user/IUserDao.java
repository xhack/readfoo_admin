package com.dao.user;

import com.entity.user.User;

public abstract interface IUserDao
{
  public abstract int lookUser();
  
  public abstract int deleteUser(int paramInt);
  
  public abstract void saveUser(User paramUser);
  
  public abstract User getUserByUsername(String paramString);
}

/* Location:           E:\workspace\admin\web\WEB-INF\classes
 * Qualified Name:     com.dao.user.IUserDao
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */