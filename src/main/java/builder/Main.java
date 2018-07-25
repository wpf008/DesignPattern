package builder;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 14:58 2018/7/25
 * @Modified by
 */

/**
 * 建造者模式是将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 建造者、工厂模式、抽象工厂的区别
 * 建造者关注的是创建一个产品的内部细节，比如创建一个电脑考虑如何创建cpu,memory,hardDisk等等
 * 工厂模式关注是创建某个物品的一系列产品，比如汽车工厂它考虑如何创建小轿车，卡车，汽车等不考虑里面的引擎轮子啥的，这些细节交给建造者模式
 * 抽象工厂关注的是一个抽象工厂既可以生产汽车一系列产品也可以生产电脑一系列产品
 */

public class Main {

    public static void main(String[] args) {
        IComputerBuilder computerBuilder = new ComputerBuilderImpl();
        ComputerDirector computerDirector =new ComputerDirector();
        Computer computer = computerDirector.constructComputer(computerBuilder);
        System.out.println(computer);

    }
}
