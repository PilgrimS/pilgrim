package com.pilgrim.hxy.controller;

import com.pilgrim.hxy.common.utils.CommonRetCode;
import com.pilgrim.hxy.common.utils.ResponseMsg;
import com.pilgrim.hxy.entity.WChatUser;
import com.pilgrim.hxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hexy
 * @date 2018/12/1914:54
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    @ResponseBody
    public ResponseMsg register(HttpServletRequest request, WChatUser user){
        userService.register(user);
        return new ResponseMsg(CommonRetCode.SUCCESS);
    }

}
