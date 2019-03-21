package com.wf.json.controller;

import com.wf.json.dao.UserResposity;
import com.wf.json.pojo.Add;
import com.wf.json.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Login {
   @Autowired
   private UserResposity userResposity;
    @RequestMapping("/login")
   public  String login(){

       return "login";
   }
    @RequestMapping("/loginsuccess")
    public String userLogin( HttpServletRequest request){

        Integer id=Integer.parseInt( request.getParameter("username"));
        String password=request.getParameter("password");

        Users users =this.userResposity.queryByIdAndPassword(id,password);

        if (users!=null)
            return "success";
        else
            return "";
    }


}
