package singleton;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 17:05 2018/7/24
 * @Modified by
 */

/**
 * double check lock (DCL)
 */
public class DCLSignleton {

    private static DCLSignleton dCLSignleton;

    private DCLSignleton() {

    }

    public static DCLSignleton getInstance() {
        try {
            if (dCLSignleton == null) {
                synchronized (DCLSignleton.class) {
                    dCLSignleton = new DCLSignleton();
                }

            }

        } catch (Exception e) {

        }
        return dCLSignleton;
    }
}
