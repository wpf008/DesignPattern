package proxy.staticProxy;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 15:48 2018/7/24
 * @Modified by
 */
public class Main {
    public static void main(String[] args) {
        BuyCar buyCar =new BuyCarImpl();

        buyCar.iBuyCar();
        ProxyBuCar proxyBuCar = new ProxyBuCar(buyCar);
        proxyBuCar.iBuyCar();
    }
}
