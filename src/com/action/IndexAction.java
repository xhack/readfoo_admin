package com.action;

import com.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexAction
{
  @Autowired
  private com.service.user.IUserService userService;
  
  public IndexAction() {}
  
  @RequestMapping({"/"})
  public String getUser(User user)
  {
/* 19 */     return "index";
  }
}

/* Location:           E:\workspace\admin\web\WEB-INF\classes
 * Qualified Name:     com.action.IndexAction
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */