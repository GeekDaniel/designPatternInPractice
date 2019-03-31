package com.surpass.c1.codes.v4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/3/28 11:59 PM
 */
class MachineDuck extends  Duck{

    public MachineDuck() {
        this.flyable=new FlyWithBlades();
    }
}
