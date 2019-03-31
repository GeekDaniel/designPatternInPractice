package com.surpass.c2.codes.v2;


/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/4/1 12:04 AM
 */
public class DistributionCenter {

    public static void main(String[] args){
        GoodData goodData=new GoodData(11,1);
        JDApi jdApi = new JDApi(goodData);
        TmallApi tmallApi = new TmallApi(goodData);
        //谁来判别，以及如何判别商品变动,上帝之手
        goodData.notifyAllObservers();

    }
}
