package proxy.staticProxy;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 15:47 2018/7/24
 * @Modified by
 */
public class ProxyBuCar implements BuyCar {

    private BuyCar buyCar;
    public ProxyBuCar(BuyCar buyCar){
        this.buyCar=buyCar;
    }

    public void iBuyCar() {
        System.out.println("代理帮我买车！");
        buyCar.iBuyCar();

    }
}
