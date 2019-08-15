package com.gyd.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by acer on 2019/8/15.
 */
@Repository
//@Mapper
public interface UserMapper {
    Integer login();
    Integer checkLogin(@Param("username") String username, @Param("password") String password);
}
