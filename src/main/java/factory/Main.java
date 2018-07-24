package factory;

/**
 * @Author:pengfei
 * @Description
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
