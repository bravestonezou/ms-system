package com.stone.ms.service.impl;

import com.stone.ms.entity.Merchant;
import com.stone.ms.mapper.MerchantMapper;
import com.stone.ms.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/10 21:23
 * @Email zou.shiyong@frontsurf.com
 */
@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantMapper merchantMapper;

    @Override
    public int insert(Merchant merchant) {
        return merchantMapper.insert(merchant);
    }

    @Override
    public List<Merchant> findAll() {
        return merchantMapper.findAll();
    }

    @Override
    public Merchant findById(int id) {
        return merchantMapper.findById(id);
    }

    @Override
    public void deleteById(int id) {
        merchantMapper.deleteById(id);
    }

    @Override
    public void update(Merchant merchant) {
        merchantMapper.update(merchant);
    }
}
