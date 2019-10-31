package com.example.service;

import com.example.dao.DaoTest;
import com.example.entity.EntityTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 测试service
 *
 * @author gan.jin@ucarinc.com
 * @version 1.0
 * @Date 2019/10/31 10:53
 */
@Service
public class ServiceTest {
    @Autowired
    private DaoTest daoTest;
    public String getServiceString(){
        return daoTest.getDaoString()+"Service";
    }
}
