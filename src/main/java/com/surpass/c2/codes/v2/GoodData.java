package com.surpass.c2.codes.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/4/1 12:47 AM
 */
@Getter
public class GoodData implements Observable {
    /**
     * 商品Id
     */
    int goodId;

    /**
     * 商品目前状态 0:下架  1：上架
     */
    int status;

    List<Observer> observers=new ArrayList<Observer>();

    public GoodData(int goodId, int status) {
        this.goodId = goodId;
        this.status = status;
    }

    public void addObserver(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    public void deleteObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }

    }
}
