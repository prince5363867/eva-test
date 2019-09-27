package eva.evatest.factory.abstractFactory.cpu;

/**
 * @author 方银剑
 * @Title: IntelCpu
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/9/27
 */
public class IntelCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins = 0;
    public  IntelCpu(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        // TODO Auto-generated method stub
        System.out.println("Intel CPU的针脚数：" + pins);
    }

}