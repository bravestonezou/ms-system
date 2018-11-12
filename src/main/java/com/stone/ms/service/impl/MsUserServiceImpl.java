package com.stone.ms.service.impl;

import com.stone.ms.entity.MsUser;
import com.stone.ms.mapper.MsUserMapper;
import com.stone.ms.service.MsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/12 21:01
 * @Email zou.shiyong@frontsurf.com
 */
@Service
public class MsUserServiceImpl implements MsUserService {

    @Autowired
    private MsUserMapper msUserMapper;

    /**
     * 新增
     *
     * @param msUser
     * @return
     */
    @Override
    public int insert(MsUser msUser) {
        return msUserMapper.insert(msUser);
    }

    /**
     * 查询所有用户信息
     *
     * @return
     */
    @Override
    public List<MsUser> findAll() {
        return msUserMapper.findAll();
    }

    /**
     * 根据id查找用户信息
     *
     * @param id
     * @return
     */
    @Override
    public MsUser findById(int id) {
        return msUserMapper.findById(id);
    }

    /**
     * 根据id删除用户
     *
     * @param id
     */
    @Override
    public void deleteById(int id) {
        msUserMapper.deleteById(id);
    }

    /**
     * 根据id更新用户信息
     *
     * @param msUser
     */
    @Override
    public void update(MsUser msUser) {
        msUserMapper.update(msUser);
    }
}
