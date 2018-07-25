package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:pengfei
 * @Description 被观察者
 * @Date:Created in 13:30 2018/7/25
 * @Modified by
 */
public class Subject {

    List<Observer> observers= new ArrayList<Observer>();//观察者集合

    public void change(String msg){//消息发布
        notifyAllObservers(msg);//通知所有观察者
    }

    public void addObserver(Observer observer){//添加观察者
        observers.add(observer);
    }

    public void addObservers(List<Observer> observers){//添加观察者
        observers.addAll(observers);
    }



    public void notifyAllObservers(String msg){//通知观察者
        if(observers ==null || observers.size()==0){
            throw new RuntimeException("sorry,当前消息:"+msg+",没有观察者观察.");
        }else {
            for(Observer observer :observers){
                observer.update(msg);
            }
        }

    }

}
