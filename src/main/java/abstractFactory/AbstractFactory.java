package abstractFactory;

import abstractFactory.car.Car;
import abstractFactory.color.Color;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 18:07 2018/7/24
 * @Modified by
 */
public interface AbstractFactory {

    public Color getColor(String color);
    public Car getCar(String car);
}
