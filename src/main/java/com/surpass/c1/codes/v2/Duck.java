package com.surpass.c1.codes.v2;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description:诶呀，鸭子好像还会飞哦。
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/3/28 10:32 PM
 */
class Duck {
    private String color;
    private BigDecimal weight;

    /**
     * 添加了飞的行为。
     */
    public void fly(){
        System.out.println("fly with wings!");
    }

    public void quack(){
        System.out.println("gua gua!");
    }
}
