package com.pilgrim.hxy.entity;

import lombok.Data;

/**
 * @author hexy
 * @date 2018/12/1914:37
 */
@Data
public class WChatUser {
    private long openid;
    private String nickname;
    private int sex;
    private String province;
    private String city;
    private String country;
    private String headimgurl;
    private String privilege;
    private long unionid;
}
