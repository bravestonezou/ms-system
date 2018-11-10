package com.stone.ms.service;

import com.stone.ms.entity.Merchant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/10 21:52
 * @Email zou.shiyong@frontsurf.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MerchantServiceTest {

    @Autowired
    MerchantService merchantService;

    @Test
    public void insert() throws Exception {

        Merchant merchant = new Merchant();
        merchant.setMerchantname("Merchantname");
        merchant.setMerchantshopname("shopname");
        merchant.setMerchantaccount("account");
        merchant.setMerchantpassword("password");
        merchant.setMerchantscope("scope");
        merchantService.insert(merchant);
    }

    @Test
    public void findAll() throws Exception {
        List<Merchant> merchants = merchantService.findAll();
        for (Merchant m :
                merchants) {
            System.out.println(m);
        }
    }

    @Test
    public void findById() throws Exception {
        Merchant merchant = merchantService.findById(1);
        System.out.println(merchant);
    }

    @Test
    public void update() throws Exception {
        Merchant merchant = new Merchant();
        merchant.setId(1);
        merchant.setMerchantname("Merchantname-11");
        merchant.setMerchantshopname("shopname-11");
        merchant.setMerchantaccount("account-11");
        merchant.setMerchantpassword("password-11");
        merchant.setMerchantscope("scope-11");
        merchantService.update(merchant);
    }

    @Test
    public void deleteById() throws Exception {
        merchantService.deleteById(1);
    }



}