package singleton;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 17:14 2018/7/24
 * @Modified by
 */

/**
 * 枚举方式
 */
public enum  EnumSingleton {
    ENUM_SINGLETON;
    public EnumSingleton getInstance() {
        return ENUM_SINGLETON;
    }
}
