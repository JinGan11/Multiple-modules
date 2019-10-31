package com.example.dao;

import com.example.entity.EntityTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description: 测试Dao
 *
 * @author gan.jin@ucarinc.com
 * @version 1.0
 * @Date 2019/10/31 10:50
 */
@Component
public class DaoTest {
    @Autowired
    private EntityTest entityTest;
    public String getDaoString(){
        return entityTest.getEntityString()+"Dao";
    }
}
