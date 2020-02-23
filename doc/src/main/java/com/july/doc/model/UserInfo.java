package com.july.doc.model;

import lombok.Data;

/**
 * @author zqk
 * @since 2020/1/25
 */
@Data
public class UserInfo {

    /**
     * id
     */
    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;

}
