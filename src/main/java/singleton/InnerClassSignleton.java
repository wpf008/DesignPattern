package singleton;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 17:12 2018/7/24
 * @Modified by
 */

/**
 * 内部类方式
 */
public class InnerClassSignleton {

    private static  class InnerClassHandler{
        private final static InnerClassSignleton innerClassSignleton = new InnerClassSignleton();
    }

    public static InnerClassSignleton getInstance(){
        return InnerClassHandler.innerClassSignleton;
    }
}
