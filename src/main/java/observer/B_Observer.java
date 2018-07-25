package observer;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 13:29 2018/7/25
 * @Modified by
 */
public class B_Observer  implements Observer {
    public void update(String msg) {
        System.out.println(B_Observer.class.getCanonicalName()+" "+msg);
    }
}
