package abstractFactory;

import abstractFactory.car.CarFactory;
import abstractFactory.color.ColorFactory;

/**
 * @Author:pengfei
 * @Description 总工厂来实现各个分工厂
 * @Date:Created in 18:11 2018/7/24
 * @Modified by
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String fatory){
        if(fatory.equals("car")){
            return new CarFactory();
        }
        if(fatory.equals("color")){
            return new ColorFactory();
        }
        return null;
    }
}
