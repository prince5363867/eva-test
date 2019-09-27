package eva.evatest.factory.abstractFactory;

import eva.evatest.factory.abstractFactory.cpu.Cpu;
import eva.evatest.factory.abstractFactory.mainboard.Mainboard;

/**
 * @author 方银剑
 * @Title: AbstractFactory
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/9/27
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return CPU对象
     */
    public Cpu createCpu();
    /**
     * 创建主板对象
     * @return 主板对象
     */
    public Mainboard createMainboard();
}
