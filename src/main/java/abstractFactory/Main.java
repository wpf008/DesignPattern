package abstractFactory;

import abstractFactory.car.Car;
import abstractFactory.color.Color;

/**
 * @Author:pengfei
 * @Description 抽象工厂设计模式
 * @Date:Created in 18:02 2018/7/24
 * @Modified by
 */

public class Main {

    public static void main(String[] args) {
        AbstractFactory carFactory = FactoryProducer.getFactory("car");
        Car truck = carFactory.getCar("TRUCK");
        truck.product();
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.product();
    }
}
