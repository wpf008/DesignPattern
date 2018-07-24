package singleton;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 17:03 2018/7/24
 * @Modified by
 */

/**
 * 懒汉模式线程安全
 */
public class ThreadSafeSignleton {
    private static ThreadSafeSignleton threadSafeSignleton;

    private ThreadSafeSignleton() {

    }

    public static ThreadSafeSignleton getInstance() {
        try {
            synchronized (ThreadSafeSignleton.class) {
                threadSafeSignleton = new ThreadSafeSignleton();
            }

        } catch (Exception e) {

        }
        return threadSafeSignleton;
    }
}
