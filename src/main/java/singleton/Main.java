package singleton;

/**
 * @Author:pengfei
 * @Description 单例设计模式 该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
 * @Date:Created in 16:59 2018/7/24
 * @Modified by
 */
public class Main {

    public static void main(String[] args) {
        SignletonObject signletonObject =SignletonObject.getInstance();
        SignletonObject signletonObject2 =SignletonObject.getInstance();
        System.out.println("SignletonObject :"+(signletonObject.equals(signletonObject2)));

        ThreadSafeSignleton threadSafeSignleton=ThreadSafeSignleton.getInstance();
        ThreadSafeSignleton threadSafeSignleton1=ThreadSafeSignleton.getInstance();
        System.out.println("ThreadSafeSignleton :"+(threadSafeSignleton.equals(threadSafeSignleton)));


        DCLSignleton dclSignleton=DCLSignleton.getInstance();
        DCLSignleton dclSignleton1=DCLSignleton.getInstance();
        System.out.println("DCLSignleton :"+(signletonObject.equals(signletonObject2)));

        InnerClassSignleton innerClassSignleton = InnerClassSignleton.getInstance();
        InnerClassSignleton innerClassSignleton1 =InnerClassSignleton.getInstance();
        System.out.println("InnerClassSignleton :"+(innerClassSignleton.equals(innerClassSignleton1)));


        EnumSingleton enumSingleton =EnumSingleton.ENUM_SINGLETON;
        EnumSingleton enumSingleton2 =EnumSingleton.ENUM_SINGLETON;
        System.out.println("EnumSingleton  :"+(enumSingleton.equals(enumSingleton2)));
    }
}
