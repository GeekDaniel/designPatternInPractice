package com.surpass.c2.codes.v1;

import lombok.AllArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Description: 商品数据
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/3/31 10:49 PM
 */
@AllArgsConstructor
public class GoodData {

    /**
     * 商品Id
     */
    int goodId;

    /**
     * 商品目前状态 0:下架  1：上架
     */
    int status;

    //todo 这里其实我们只是定义了商品变更的行为，并没有给出谁来判别，以及如何判别商品变动
    public void goodStatusChanged() {
        if (status == 0) {
            JDApi.onSale(goodId);
            TmallApi.onSale(goodId);
        }

        JDApi.offSale(goodId);
        TmallApi.offSale(goodId);

    }

}
