package abstractFactory.car;

import abstractFactory.AbstractFactory;
import abstractFactory.color.Color;

/**
 * @Author:pengfei
 * @Description 继承抽象工厂接口实现汽车工厂方法来生产各种汽车
 * @Date:Created in 18:00 2018/7/24
 * @Modified by
 */
public class CarFactory  implements AbstractFactory {


    public Color getColor(String color) {
        return null;
    }

    public Car getCar(String type){
        if(type == null){
            return null;
        }
        if(type.equals("SEDAN")){
            return new Sedan();
        }
        if(type.equals("AUTOMOBILE")){
            return new Automobile();
        }
        if(type.equals("TRUCK")){
            return new Truck();
        }
        return null;
    }
}
