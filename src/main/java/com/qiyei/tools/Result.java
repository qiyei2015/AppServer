package com.qiyei.tools;

import com.google.gson.Gson;

/**
 * Created by qiyei2015 on 2016/12/30.
 */
public class Result<D> {
    private static final Gson sGson = new Gson();

    private int code;   //http返回编码
    private String msg; //成功或失败信息
    private D data; //数据实体

    /**
     * Gson序列化
     * @return
     */
    private String toJson(){
        return sGson.toJson(this);
    }

    /**
     * 根据code msg data 等创建一个返回结果
     * @param code
     * @param msg
     * @param data
     * @param <D>
     * @return
     */
    public static <D> String create(int code,String msg,D data){
        Result<D> result = new Result<D>();
        result.code = code;
        result.msg = msg;
        result.data = data;
        return result.toJson();
    }

}
