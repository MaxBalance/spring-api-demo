package com.maxbalance.service.impl;

import com.maxbalance.dao.TestUserDao;
import com.maxbalance.model.TestUser;
import com.maxbalance.service.TestUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author: maxbalance
 * Description:
 * Date: 2017-01-08 14:54
 */
@Service("testUserService")
public class TestUserServiceImpl implements TestUserService{
    @Resource
    TestUserDao testUserDao;

    public TestUser createUser(TestUser testUser) {
        return testUserDao.createTestUser(testUser);
    }
}
