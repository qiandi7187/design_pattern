package com.Builder.my;

public class Person {

    private Integer age;

    private String name;

    private String sex;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static class Builder{
        private Person person ;

        public Builder() {
            person = new Person();
        }

        public Builder age(Integer age){
            person.age = age;
            return this;
        }

        public Builder name(String name ){
            person.name = name;
            return this;
        }

        public Builder sex(String sex){
            person.sex=sex;
            return this;
        }

        public Person build(){
            return this.person;
        }

    }


}
