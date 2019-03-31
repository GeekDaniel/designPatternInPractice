package com.surpass.c2.codes.v2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: daniel
 * @creed: focus on the domain !
 * @Time: 2019/4/1 12:45 AM
 */
public interface Observable {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyAllObservers();

}
