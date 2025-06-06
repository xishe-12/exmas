package com.sxt.service.impl;

import com.sxt.dao.TeaUserDao;
import com.sxt.pojo.TeaUser;
import com.sxt.service.TeaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * exams   com.sxt.service.impl
 * 2022-06-26  16:34
 *
 * @author sxt  Administrator
 * description : 不可描述
 * @date 2022/6/26  16:34
 */
@Service
public class TeaUserServiceImpl implements TeaUserService {
    @Autowired
    TeaUserDao teaUserDao;
    @Override
    public TeaUser teaLogin(String username, String userpwd) {
        return teaUserDao.teaLogin(username,userpwd);
    }

    @Override
    public String getTeaTruename(String username) {
        return teaUserDao.getTeaTruename(username);
    }

    @Override
    public Integer getClassId(String username) {
        return teaUserDao.getClassId(username);
    }

    @Override
    public Integer getUserid(String username) {
        return teaUserDao.getUserid(username);
    }
}
