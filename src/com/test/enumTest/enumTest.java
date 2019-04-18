package com.test.enumTest;

public class enumTest {

    public static void main(String[] args) {

        System.out.println(MySimpleColorEnum.BLUE);
        System.out.println(MySimpleColorEnum.GREEN);
        System.out.println(MySimpleColorEnum.RED);

        System.out.println(MySimpleColorEnum.values()[0]);
        System.out.println(MySimpleColorEnum.valueOf("RED").getClass());


        System.out.println("----------------------------------");
        System.out.println(MyTimeUnit.MINUTES);
        System.out.println(MyTimeUnit.HOUR);
        System.out.println(MyTimeUnit.valueOf("HOUR"));
        System.out.println(MyTimeUnit.MINUTES.show());
        System.out.println(MyTimeUnit.HOUR.show());

    }
}
