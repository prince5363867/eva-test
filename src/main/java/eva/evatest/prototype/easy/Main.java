package eva.evatest.prototype.easy;

import eva.evatest.prototype.easy.impl.Product;

/**
 * @author 方银剑
 * @Title: Main
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/10/11
 */
public class Main {

    public static void main(String[] args) {
        Client manager = new Client();
        ConcreteProtorype1 underlinePen=new ConcreteProtorype1('~');
        ConcreteProtorype2 mbox=new ConcreteProtorype2('*');
        ConcreteProtorype2 sbox=new ConcreteProtorype2('/');
        manager.register("Strong message", underlinePen);
        manager.register("Waring Box", mbox);
        manager.register("Slash Box", sbox);
        Product p1=manager.create("Strong message");
        p1.use("hello world");
        Product p2=manager.create("Waring Box");
        p2.use("hello world");
        Product p3=manager.create("Slash Box");
        p3.use("hello world");
    }

}
