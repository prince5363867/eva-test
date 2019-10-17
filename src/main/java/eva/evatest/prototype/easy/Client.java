package eva.evatest.prototype.easy;

/**
 * @author 方银剑
 * @Title: Manager
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/10/11
 */
import eva.evatest.prototype.easy.impl.Product;

import java.util.HashMap;

public class Client {
    //保存实例的“名字”和“实例”之间的对应关系
    private HashMap<String, Product> showcase=new HashMap<String, Product>();
    //register方法将接收到的一组“名字”和“Product接口”注册到showcase中。这里Product是实现Product接口的实例，具体还未确定
    public void register(String name ,Product product){
        showcase.put(name, product);
    }
    public Product create(String productname){
        Product p=showcase.get(productname);
        return p.creatClone();
    }

}