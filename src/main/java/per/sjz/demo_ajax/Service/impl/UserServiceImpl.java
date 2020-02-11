package per.sjz.demo_ajax.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.sjz.demo_ajax.Service.UserService;
import per.sjz.demo_ajax.dao.UserDao;
import per.sjz.demo_ajax.pojo.User;

/**
 * 2020/2/1  11:44
 * 自有白鹿，踏歌入梦来
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserName(String loginname) {
        return userDao.findUserName(loginname);
    }

    @Override
    public User findNum(String loginname) {
        return userDao.findNum(loginname);
    }
}
