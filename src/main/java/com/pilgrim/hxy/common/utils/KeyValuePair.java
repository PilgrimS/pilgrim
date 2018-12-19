package com.pilgrim.hxy.common.utils;

import lombok.Data;

/**
 * @author hexy
 * @date 2018/12/1915:08
 */
@Data
public class KeyValuePair implements Comparable<KeyValuePair> {
    private int code;

    private String msg;

    public KeyValuePair(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int compareTo(KeyValuePair o) {
        if (o.getCode() == this.code && o.getMsg().equals(this.getMsg())){
            return 0;
        }else return 1;
    }
}
