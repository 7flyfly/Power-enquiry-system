package com.wf.json.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wf.json.dao.UserResposity;
import com.wf.json.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserResposity userResposity;

    @RequestMapping("/users")
    public List<Users> findUsers(){
        List<Users>usersList=(List<Users>) this.userResposity.queryUsers();
        return usersList;

    }

    @RequestMapping("/users2")
    public String findUsers2(){
        List<Users>usersList=(List<Users>) this.userResposity.queryUsers();
        return JSONObject.toJSONString(usersList);

    }

}
