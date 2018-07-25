package abstractFactory;

import abstractFactory.car.Car;
import abstractFactory.color.Color;

/**
 * @Author:pengfei
 * @Description 工厂接口，里面有要生产该成品对应的工厂
 * @Date:Created in 18:07 2018/7/24
 * @Modified by
 */
public interface AbstractFactory {

    public Color getColor(String color);
    public Car getCar(String car);
}
