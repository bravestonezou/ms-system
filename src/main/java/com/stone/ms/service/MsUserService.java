package com.stone.ms.service;

import com.stone.ms.entity.MsUser;

import java.util.List;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/12 21:01
 * @Email zou.shiyong@frontsurf.com
 */
public interface MsUserService {
    /**
     * 新增
     * @param msUser
     * @return
     */
    int insert(MsUser msUser);

    /**
     * 查询所有用户信息
     * @return
     */
    List<MsUser> findAll();

    /**
     * 根据id查找用户信息
     * @param id
     * @return
     */
    MsUser findById(int id);

    /**
     * 根据id删除用户
     * @param id
     */
    void deleteById(int id);

    /**
     * 根据id更新用户信息
     * @param msUser
     */
    void update(MsUser msUser);
}
