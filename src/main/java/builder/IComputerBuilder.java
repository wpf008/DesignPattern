package builder;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 14:52 2018/7/25
 * @Modified by
 */
public interface IComputerBuilder {

    public void buildCpu();
    public void buildMemory();
    public void buildHardDisk();


    public Computer buildComputer();

}
