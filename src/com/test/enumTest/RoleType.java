package com.test.enumTest;

import java.util.HashMap;
import java.util.Map;

public enum RoleType {
    PARENT("家长", 1),
    TEACHER("教师（班主任）", 2),
    TWSJ("团委书记", 3),
    JIANGSHI("讲师", 4),
    DAIKE("代课老师",5),
    XUEGONGCHU("学工处",6);

    private int index;
    private String name;
    /**
     * @Description: 构造方法私有化
     * @Param:
     * @return:
     * @Author: Qiandi
     * @Date: 2018/8/16  16:58
     */
    private RoleType(String name, int index) {
        this.name = name;
        this.index = index;
    }

    /**
     * @Description:  初始化构建Mapping
     * @Param:
     * @return:
     * @Author: Qiandi
     * @Date: 2018/8/16  16:56
     */
    private static final Map<String,RoleType> roleTypeMap = new HashMap<>();
    static {
        for (RoleType r : RoleType.values()) {
            roleTypeMap.put(r.toString(),r);
        }
    }

    public boolean match(String s){
        return this.toString().equals(s.toUpperCase().toString());
    }




    /**
     * @Description:.通过枚举获得编号
     * @Param:
     * @return:
     * @Author: Qiandi
     * @Date: 2018/8/16  16:57
     */
    public static Integer getIndexByRoleType(String roleType) {
        return roleTypeMap.get(roleType.toUpperCase()).index;
    }

    public static void main(String[] args){
        System.out.println(RoleType.TEACHER);
        System.out.println(RoleType.TEACHER.getClass());
        System.out.println(RoleType.TEACHER.index);
        System.out.println(RoleType.TEACHER.name);
        System.out.println(getIndexByRoleType("PARENT"));
        System.out.println(getIndexByRoleType("TEACHER"));
        System.out.println(roleTypeMap);
        System.out.println(roleTypeMap.get("PARENT").index);
        System.out.println("TEACHER".equals(RoleType.TEACHER));

        System.out.println(RoleType.TEACHER.equals("TEACHER"));


    }

}
