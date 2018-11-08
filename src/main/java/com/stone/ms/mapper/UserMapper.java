package com.stone.ms.mapper;

import com.stone.ms.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/8 21:23
 * @Email zou.shiyong@frontsurf.com
 */
@Mapper
public interface UserMapper {

    int insert(User user);
    List<User> findAll();
    User findById(int id);
    void deleteById(int id);
    void update(User user);

}
