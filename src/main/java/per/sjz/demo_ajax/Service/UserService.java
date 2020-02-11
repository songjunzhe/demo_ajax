package per.sjz.demo_ajax.Service;

import per.sjz.demo_ajax.pojo.User;

/**
 * 2020/2/1  11:44
 * 自有白鹿，踏歌入梦来
 */


public interface UserService {
    public User findUserName(String loginname);
    public User findNum(String loginname);

}
