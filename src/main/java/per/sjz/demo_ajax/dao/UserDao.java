package per.sjz.demo_ajax.dao;

import org.springframework.stereotype.Repository;
import per.sjz.demo_ajax.pojo.User;

/**
 * 2020/2/1  11:38
 * 自有白鹿，踏歌入梦来
 */

@Repository
public interface UserDao {
    public User findUserName(String loginname);
    public User findNum(String loginname);
}
