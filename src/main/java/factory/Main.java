package factory;

/**
 * @Author:pengfei
 * @Description 工厂设计模式:创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象.
 * @Date:Created in 18:02 2018/7/24
 * @Modified by
 */
public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car sedan = carFactory.getCar("SEDAN");
        sedan.product();

        Car automobile = carFactory.getCar("AUTOMOBILE");
        automobile.product();

        Car truck = carFactory.getCar("TRUCK");
        truck.product();
    }
}
