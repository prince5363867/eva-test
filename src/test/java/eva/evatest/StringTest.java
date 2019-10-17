package eva.evatest;

/**
 * @author 方银剑
 * @Title: StringTest
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/10/17
 */
public class StringTest {

    public static void main(String[] args) {

        String a = "a" ,b="b",c ="c", ab = "ab";
        final String a1 = "a",b1 = "b";
        System.out.println(a == c);//f
        System.out.println(a == a1);//t
        System.out.println(ab == a+b);//f
        System.out.println(ab == a1+b1);//t
        System.out.println(ab == "a"+"b");//t
        System.out.println(a+b == a+b);//f

    }
}
