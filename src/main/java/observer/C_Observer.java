package observer;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 13:29 2018/7/25
 * @Modified by
 */
public class C_Observer  implements Observer {
    public void update(String msg) {
        System.out.println(C_Observer.class.getCanonicalName()+" "+msg);
    }
}
