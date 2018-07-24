package abstractFactory.color;

import abstractFactory.AbstractFactory;
import abstractFactory.car.Car;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 18:08 2018/7/24
 * @Modified by
 */
public class ColorFactory implements AbstractFactory {
    public Color getColor(String color) {

        if(color.equals("red")){
            return new RedColor();
        }
        if(color.equals("blue")){
            return new BlueColor();
        }
        return null;
    }

    public Car getCar(String car) {
        return null;
    }
}
