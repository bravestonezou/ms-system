package com.stone.ms.mapper;

import com.stone.ms.entity.MsProductInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/14 21:04
 * @Email zou.shiyong@frontsurf.com
 */
@Mapper
public interface MsProductInfoMapper {

    /**
     * 添加秒杀商品
     * @param msProductInfo
     */
    void applyMsProduct(MsProductInfo msProductInfo);
}
