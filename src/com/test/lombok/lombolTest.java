package com.test.lombok;

public class lombolTest {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(6);
        dog.setName("卡卡");
        dog.setSex("公");
        System.out.println(dog);
        Cat cat = new Cat.CatBuilder().age(2).name("观复猫").sex("公").build();
        System.out.println(cat);
    }

}
