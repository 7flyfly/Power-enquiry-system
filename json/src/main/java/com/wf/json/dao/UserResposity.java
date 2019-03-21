package com.wf.json.dao;

import com.wf.json.pojo.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserResposity extends Repository<Users,Integer> {
    @Query(value = "select * from t_users",nativeQuery = true)
    List<Users> queryUsers();

    @Query(value = "select * from t_users where id=? and password=?",nativeQuery = true)
    Users queryByIdAndPassword(Integer id,String password);
}
