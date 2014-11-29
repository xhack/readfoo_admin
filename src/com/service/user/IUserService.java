package com.service.user;

import com.entity.user.User;

public abstract interface IUserService
{
  public abstract int lookUser();
  
  public abstract int deleteUser(int paramInt);
  
  public abstract void saveUser(User paramUser);
  
  public abstract int userLogin(User paramUser);
}

/* Location:           E:\workspace\admin\web\WEB-INF\classes
 * Qualified Name:     com.service.user.IUserService
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */