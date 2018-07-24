package singleton;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 16:58 2018/7/24
 * @Modified by
 */

/**
 * 饿汉模式
 */
public class SignletonObject {

    private static SignletonObject signletonObject = new SignletonObject();

    private SignletonObject(){

    }
    public static SignletonObject getInstance(){
        return signletonObject;
    }

}
