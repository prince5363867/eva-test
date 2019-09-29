package eva.evatest.factory.abstractFactory;

import eva.evatest.factory.abstractFactory.cpu.Cpu;
import eva.evatest.factory.abstractFactory.cpu.IntelCpu;
import eva.evatest.factory.abstractFactory.mainboard.IntelMainboard;
import eva.evatest.factory.abstractFactory.mainboard.Mainboard;

/**
 * @author 方银剑
 * @Title: AmdFactory
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/9/27
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainboard(938);
    }

}