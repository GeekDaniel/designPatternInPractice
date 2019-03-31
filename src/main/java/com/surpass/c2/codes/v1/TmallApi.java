package com.surpass.c2.codes.v1;

import lombok.extern.slf4j.Slf4j;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/3/31 10:49 PM
 */
@Slf4j
public class TmallApi {
    public static void onSale(int goodId) {
        log.info("good {} on sale in Tmall!", goodId);
    }

    public static void offSale(int goodId) {
        log.info("good {} off sale in Tmall!", goodId);
    }
}
