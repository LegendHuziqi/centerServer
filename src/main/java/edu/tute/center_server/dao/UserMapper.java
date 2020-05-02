package edu.tute.center_server.dao;

import edu.tute.center_server.Bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    //写入user表
    Integer putUser(@Param("userName") String userName, @Param("password") String password);

    //根据name和updater查serviceId
    User getUser(@Param("userName") String userName, @Param("password") String password);

}
