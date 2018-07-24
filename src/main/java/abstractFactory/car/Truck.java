package abstractFactory.car;

import abstractFactory.car.Car;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 17:58 2018/7/24
 * @Modified by
 */
public class Truck implements Car {
    public void product() {
        System.out.println("卡车生产ing");
    }
}
