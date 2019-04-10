package com.test.jsonTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * Created by Qd on 2016/12/6.
 */
public class FastjsonUtils {

    /**
     * 对象转成json串
     * @param obj  包含Map
     * @return
     */
    public static String obj2json(Object obj)  {
        return JSON.toJSONString(obj);
    }

    /**
     * 对象转JSONObject
     * @param obj   包含Map
     * @return
     */
    public static JSONObject obj2jsonObj(Object obj) {
        return JSON.parseObject(JSON.toJSONString(obj));
    }


    /**
     * json串转对象
     * @param jsonStr
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T json2obj(String jsonStr, Class<T> clazz)  {
        return JSON.parseObject(jsonStr, clazz);
    }

    /**
     *  json串转map
     * @param jsonStr
     * @return
     */
    public static  Map<String, Object> json2map(String jsonStr)   {
        return JSON.parseObject(jsonStr, Map.class);
    }

    /**
     * map转对象
     * @param map
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T map2obj(Map<?, ?> map, Class<T> clazz) {
        return JSON.parseObject(JSON.toJSONString(map), clazz);
    }

    /**
     * json字符串转list
     * @param jsonStr
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> json2list(String jsonStr, Class<T> clazz)  {
        return JSON.parseArray(jsonStr, clazz);
    }



}
