package com.stone.ms.service;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/14 21:51
 * @Email zou.shiyong@frontsurf.com
 */
public interface MsProductInfoService {

    /**
     * 添加秒杀商品
     * @param msProductInfo
     */
    void applyMsProduct(com.stone.ms.entity.MsProductInfo msProductInfo);
}
