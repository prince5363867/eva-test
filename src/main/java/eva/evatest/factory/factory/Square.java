package eva.evatest.factory.factory;

/**
 * @author 方银剑
 * @Title: Square
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/9/27
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
