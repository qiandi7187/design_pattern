package com.test.jsonTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.test.enumTest.MySimpleColorEnum;
import com.test.enumTest.MyTimeUnit;

public class FastJsonTest {

    public static void main(String[] args) {

        User user = new User();
        user.setName("test");
        user.setPassword("test123");
        String jsonStr = JSON.toJSONString(user);
        System.out.println("简单json结构："+jsonStr);
        User user1 = JSON.parseObject(jsonStr,User.class);
        System.out.println(user1);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("user",user);
        Page page = new Page();
        page.setPageNo(1);
        page.setPageSize(20);
        jsonObject.put("page",page);
        jsonStr = jsonObject.toJSONString();
        System.out.println("复杂json结构："+jsonStr);
        System.out.println("----------------------------------------------");
        User user2 = JSON.parseObject(jsonStr,User.class);
        Page page2 = JSON.parseObject(jsonStr,Page.class);
        System.out.println(user2);
        System.out.println(page2);
        System.out.println("----------------------------------------------");
        User user3 = JSON.parseObject(JSON.parseObject(jsonStr).getString("user"),User.class);
        Page page3 = JSON.parseObject(JSON.parseObject(jsonStr).getString("page"),Page.class);
        System.out.println(user3);
        System.out.println(page3);
        System.out.println("------------------------------------------------");

        String str4 =  "{\"pageNo\":1,\"pageSize\":20,\"name\":\"test\",\"password\":\"test123\"}";
        User user4 = JSON.parseObject(str4,User.class);
        Page page4 = JSON.parseObject(str4,Page.class);
        System.out.println(user4);
        System.out.println(page4);
        System.out.println("------------------------------------------------");





    }
}
