package com.test.optionalTest;

import com.test.lombok.Cat;
import com.test.lombok.Dog;

import java.sql.SQLOutput;
import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
       Car car = new Car();
        Optional<Car> optCar = Optional.of(car);

        Optional<Car> optCar2 = Optional.ofNullable(car);
        System.out.println("-------ofNullable 在值为null的时候不会报错 ，of 编译报错------");
        Optional<String> carWheelName = optCar2.map(Car ::getWheel).map(CarWheel::getName);
        System.out.println("获取："+carWheelName);
         carWheelName = optCar2.map(Car ::getWheel).map(CarWheel::getName);
        System.out.println("获取："+carWheelName+" 替换："+ carWheelName.orElse("无值"));

        /*car = null;
        Optional<Car> optCar3 = Optional.of(car);*/
        car.setWheel(new CarWheel( "轮子1"));


        //lambda
        Optional<String> carWheelName2 = optCar.map(value->value.getWheel()).map(value->value.getName());
        System.out.println("获取："+carWheelName2 + " 内容为："+  carWheelName2.orElse("无值") );
        //方法引用
        carWheelName2 = optCar.map(Car ::getWheel).map(CarWheel::getName);
        System.out.println("获取："+carWheelName2 + " 内容为："+  carWheelName2.get() );

    }





}
