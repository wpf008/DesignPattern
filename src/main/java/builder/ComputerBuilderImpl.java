package builder;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 14:53 2018/7/25
 * @Modified by
 */
public class ComputerBuilderImpl implements IComputerBuilder {

    private Computer computer;


    public ComputerBuilderImpl(){
        computer = new Computer();
    }


    public void buildCpu() {
        computer.setCpu("创建cpu");
    }

    public void buildMemory() {
        computer.setCpu("创建memory");
    }

    public void buildHardDisk() {
        computer.setHardDisk("创建hardDisk");
    }

    public Computer buildComputer() {
        return this.computer;
    }
}
