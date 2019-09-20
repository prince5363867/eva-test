package eva.evatest.singleton.SingeltonEnum;

/**
 * @author 方银剑
 * @Title: Test
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/9/20
 */
public class Test {

    public static void main(String[] args)
    {
        SingletonEnum instance01=SingletonEnum.INSTANCE01;
        instance01.setName("terje");
        System.out.println(instance01.getName());

        SingletonEnum instance02=SingletonEnum.INSTANCE01;
        System.out.println(instance02.getName());

        SingletonEnum instance03=SingletonEnum.INSTANCE02;
        instance03.setName("liu");
        System.out.println(instance03.getName());

        SingletonEnum instance04=SingletonEnum.INSTANCE02;
        instance04.setName("liu1");
        System.out.println(instance04.getName());

    }

}
