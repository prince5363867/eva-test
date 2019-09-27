package eva.evatest.factory.factory;

/**
 * @author 方银剑
 * @Title: Rectangle
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/9/27
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
