package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 15:52 2018/7/24
 * @Modified by
 */
public class DynamicProxyHandler implements InvocationHandler {

    Object object;
    public DynamicProxyHandler(final Object object){
        this.object=object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object,args);
    }
}
