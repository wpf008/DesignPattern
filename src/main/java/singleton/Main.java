package singleton;

/**
 * @Author:pengfei
 * @Description
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
