package com.google.gwt.sample.stockwatcher.server;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.sample.stockwatcher.client.LoginInfo;
import com.google.gwt.sample.stockwatcher.client.LoginService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LoginServiceImpl extends RemoteServiceServlet implements
    LoginService {

  public LoginInfo login(String requestUri) {
    UserService userService = UserServiceFactory.getUserService();
    User user = userService.getCurrentUser();
    LoginInfo loginInfo = new LoginInfo();

   //just got rid of an if statement here
    System.out.print("muahaha I ruined the code!!");
    
    return loginInfo;
  }

}