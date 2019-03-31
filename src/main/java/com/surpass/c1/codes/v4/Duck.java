package com.surpass.c1.codes.v4;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/3/28 10:32 PM
 */
class Duck {
    private String color;
    private BigDecimal weight;

    Flyable flyable;

    public void doFly(){
        flyable.fly();
    }

    public void quack(){
        System.out.println("gua gua!");
    }
}
