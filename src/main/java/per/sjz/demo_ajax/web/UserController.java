package per.sjz.demo_ajax.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.sjz.demo_ajax.Service.UserService;
import per.sjz.demo_ajax.pojo.Message;
import per.sjz.demo_ajax.pojo.User;
import per.sjz.demo_ajax.utils.StringUtils;

/**
 * 2020/2/1  11:46
 * 自有白鹿，踏歌入梦来
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping("/logins")
    public String logins(String LoginName, String password, ModelMap map){
        if (StringUtils.isEmpty(password) ||StringUtils.isEmpty(LoginName) ){
            map.addAttribute("msg1", "用户名或密码不能为空");
            map.addAttribute("loginname", LoginName);
            return "login";
        }
        User userName = userService.findUserName(LoginName);
        String pwd = userName.getPassword();
        if (!pwd.equals(password)){
            map.addAttribute("loginname", LoginName);
            map.addAttribute("msg", "密码错误");
            return "login";
        }
        return "success";
    }

    @RequestMapping("/regist")
    public String regist(){
        return "";
    }

    @RequestMapping("/checkname")
    @ResponseBody
    public Message a1(String username){

        User num = userService.findNum(username);
        if (num!=null) {
            return new Message("<span style='color:green;'>用户名可用</span>");
        }
        return new Message("<span style='color:red;'>用户名不存在</span>");
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }


}
