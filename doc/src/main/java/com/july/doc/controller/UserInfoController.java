package com.july.doc.controller;

import com.july.doc.model.UserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息
 * @author zqk
 * @since 2020/1/25
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {

    /**
     * 获取用户信息
     * @param userInfo :username 用户名|必填
     * @return java.lang.String
     * @author zqk
     * @since 2020/1/25 10:00 下午
     * @respbody {"id":"123","password":"123456","username":"admin"}
     * @resp code 返回码(0000表示登录成功,其它表示失败)|string|必填
     */
    @PostMapping("/getUserInfo")
    public UserInfo getUserInfo(@RequestBody UserInfo userInfo){
        return userInfo;
    }

}
