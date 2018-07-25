package abstractFactory;

import abstractFactory.car.Car;
import abstractFactory.color.Color;

/**
 * @Author:pengfei
 * @Description 抽象工厂设计:接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象.
 * @Date:Created in 18:02 2018/7/24
 * @Modified by
 */
/**
 * 抽象工厂模式相当于把多个工厂模式集合到一起的总工厂，需要创建什么产品就从总工厂获取生产该产品的工厂来生产该成品
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory carFactory = FactoryProducer.getFactory("car");//从总产得到汽车工厂
        Car truck = carFactory.getCar("TRUCK");//汽车工厂生产truck
        truck.product();
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");//从总产得到颜料工厂
        Color red = colorFactory.getColor("red");//颜料工厂生产red
        red.product();
    }
}
