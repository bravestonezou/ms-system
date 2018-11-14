package com.stone.ms.service;

import com.stone.ms.entity.MsProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/14 21:53
 * @Email zou.shiyong@frontsurf.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MsProductInfoServiceTest {

    @Autowired
    private MsProductInfoService msProductInfoService;

    @Test
    public void applyMsProduct() throws Exception {

        MsProductInfo msProductInfo = new MsProductInfo();
        msProductInfo.setProductid(10);
        msProductInfo.setProducttitle("tt");
        msProductInfo.setProductpicture("dd");
        msProductInfo.setOriginalprice(10);
        msProductInfo.setMiaoshaprice(110);
        msProductInfo.setMerchantid(30);
        msProductInfo.setApplydate(new Date());
        msProductInfo.setAuditdate(new Date());
        msProductInfo.setAduitstatus(0);
        msProductInfo.setStarttime(new Date());
        //msProductInfo.setStarttimestr("");
        msProductInfo.setEndtime(new Date());
        //msProductInfo.setEndtimestr("");
        msProductInfo.setProductcount(10);
        msProductInfo.setStockcount(110);
        msProductInfo.setDescription("dd");
        msProductInfoService.applyMsProduct(msProductInfo);
    }

}