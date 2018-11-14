package com.stone.ms.service.impl;

import com.stone.ms.entity.MsProductInfo;
import com.stone.ms.mapper.MsProductInfoMapper;
import com.stone.ms.service.MsProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/14 21:52
 * @Email zou.shiyong@frontsurf.com
 */
@Service
public class MsProductInfoServiceImpl implements MsProductInfoService {

    @Autowired
    private MsProductInfoMapper msProductInfoMapper;
    /**
     * 添加秒杀商品
     *
     * @param msProductInfo
     */
    @Override
    public void applyMsProduct(MsProductInfo msProductInfo) {

        msProductInfoMapper.applyMsProduct(msProductInfo);
    }
}
