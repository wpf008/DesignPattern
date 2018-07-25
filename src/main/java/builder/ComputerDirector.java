package builder;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 14:56 2018/7/25
 * @Modified by
 */
public class ComputerDirector {


    public Computer constructComputer(IComputerBuilder builder)
    {
        builder.buildCpu();
        builder.buildHardDisk();
        builder.buildMemory();
        return builder.buildComputer();
    }
}
