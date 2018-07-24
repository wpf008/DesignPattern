package proxy.dynamic;

import proxy.staticProxy.BuyCar;
import proxy.staticProxy.BuyCarImpl;

import java.lang.reflect.Proxy;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 15:55 2018/7/24
 * @Modified by
 */
public class Main {

    public static void main(String[] args) {
        BuyCarImpl buyCar =new BuyCarImpl();
        BuyCar proxyBuyCar = (BuyCar) Proxy.newProxyInstance(BuyCar.class.getClassLoader(),new Class[]{BuyCar.class},new DynamicProxyHandler(buyCar));
        proxyBuyCar.iBuyCar();
    }
}
