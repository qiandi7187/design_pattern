package com.test.jsonTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonUtilTest {

    public static void main(String[] args) {

        Map<String,Object> map = new HashMap();
        map.put("name","admin");
        map.put("password","123");
        User user = FastjsonUtils.map2obj(map,User.class);
        System.out.println(user.getClass().getName()+"    "+user);
        
        JSONObject jsonObject = FastjsonUtils.obj2jsonObj(map);

        System.out.println(jsonObject.getClass().getName()+"    "+jsonObject);
    }
}
