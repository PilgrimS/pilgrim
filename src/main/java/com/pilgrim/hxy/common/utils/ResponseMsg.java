package com.pilgrim.hxy.common.utils;

import lombok.Data;

/**
 * @author hexy
 * @date 2018/12/1915:04
 */
@Data
public class ResponseMsg {
    private int code;
    private String msg;
    private Object data;

    public ResponseMsg(KeyValuePair kp) {
        this.code = kp.getCode();
        this.msg = kp.getMsg();
    }

    public ResponseMsg setRetMsg(KeyValuePair kp , Object data){
        this.code = kp.getCode();
        this.msg = kp.getMsg();
        setData(data);
        return this;
    }
}
