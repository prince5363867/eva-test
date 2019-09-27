package eva.evatest.factory.factory;

/**
 * @author 方银剑
 * @Title: Circle
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/9/27
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}