package eva.evatest.factory.abstractFactory.cpu;

/**
 * @author 方银剑
 * @Title: AmdCpu
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/9/27
 */
public class AmdCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins = 0;
    public  AmdCpu(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        // TODO Auto-generated method stub
        System.out.println("AMD CPU的针脚数：" + pins);
    }
}