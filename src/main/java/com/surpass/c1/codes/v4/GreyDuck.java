package com.surpass.c1.codes.v4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/3/28 10:42 PM
 */
class GreyDuck extends Duck {
    public GreyDuck(Flyable flyable) {
        this.flyable=new FlyWithWings();
    }

}
