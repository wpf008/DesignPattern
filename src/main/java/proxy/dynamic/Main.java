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

/**
 JDK动态代理只能对实现了接口的类生成代理，而不能针对类
 CGLIB是针对类实现代理，主要是对指定的类生成一个子类，覆盖其中的方法（继承）
 CGLIB创建的动态代理对象比JDK创建的动态代理对象的性能更高，但是CGLIB创建代理对象时所花费的时间却比JDK多得多。
 所以对于单例的对象，因为无需频繁创建对象，用CGLIB合适，反之使用JDK方式要更为合适一些。同时由于CGLib由于是采用动态创建子类的方法，对于final修饰的方法无法进行代理。
 */
public class Main {

    public static void main(String[] args) {
        BuyCarImpl buyCar =new BuyCarImpl();
        BuyCar proxyBuyCar = (BuyCar) Proxy.newProxyInstance(BuyCar.class.getClassLoader(),new Class[]{BuyCar.class},new DynamicProxyHandler(buyCar));
        proxyBuyCar.iBuyCar();
    }
}
