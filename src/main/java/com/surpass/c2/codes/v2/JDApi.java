package com.surpass.c2.codes.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/4/1 12:46 AM
 */
@Slf4j
public class JDApi implements Observer {

    GoodData goodData;

    public JDApi(GoodData goodData) {
        this.goodData = goodData;
        goodData.addObserver(this);
    }

    public void update() {
        if (goodData.getStatus() == 0) {
            log.info("good {} off sale in JD!", goodData.getGoodId());
        } else {
            log.info("good {} on sale in JD!", goodData.getGoodId());
        }

    }
}
