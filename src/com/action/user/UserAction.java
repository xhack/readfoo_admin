package com.action.user;

import com.entity.user.User;
import com.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;







@Controller
public class UserAction
{
@Autowired
private IUserService userService;

public UserAction() {}

@RequestMapping({"/login.action"})
public String getUser(User user)
{
    int status = this.userService.userLogin(user);
   return "index";
}

@RequestMapping({"/user/user_list.html"})
public String userList() {
     return "user/user_list";
}
}

/* Location:           E:\workspace\admin\web\WEB-INF\classes
 * Qualified Name:     com.action.user.UserAction
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */