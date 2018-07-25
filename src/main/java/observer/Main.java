package observer;

/**
 * @Author:pengfei
 * @Description观察者模式 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * @Date:Created in 13:35 2018/7/25
 * @Modified by
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer a_observer=new A_Observer();
        Observer b_observer=new B_Observer();
        Observer c_observer=new C_Observer();

        //添加观察者到
        subject.addObserver(a_observer);
        subject.addObserver(b_observer);
        subject.addObserver(c_observer);
        subject.change("消息发布了");
    }
}
