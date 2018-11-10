package com.stone.ms.mapper;

import com.stone.ms.entity.Merchant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/10 21:16
 * @Email zou.shiyong@frontsurf.com
 */
@Mapper
public interface MerchantMapper {

    /**
     * 新增
     * @param merchant
     * @return
     */
    int insert(Merchant merchant);

    /**
     * 查询所有商家信息
     * @return
     */
    List<Merchant> findAll();

    /**
     * 根据id查找商家信息
     * @param id
     * @return
     */
    Merchant findById(int id);

    /**
     * 根据id删除商家信息
     * @param id
     */
    void deleteById(int id);

    /**
     * 根据商家id更新商家信息
     * @param merchant
     */
    void update(Merchant merchant);
}
