package eva.evatest.prototype.easy;

import eva.evatest.prototype.easy.impl.Product;

/**
 * @author 方银剑
 * @Title: ConcreteProtorype2
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/10/11
 */
public class ConcreteProtorype2  implements Product {

    private char ulchar;

    public ConcreteProtorype2(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\""+s+"\"");
        for (int i = 0; i <length+2; i++) {
            System.out.print(ulchar);

        }
        System.out.println("");
    }

    @Override
    public Product creatClone() {
        Product p=null;
        try {
            p=(Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
