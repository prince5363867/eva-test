package com.eva.evaTest.adapter.classAdapter;


import com.eva.evaTest.adapter.classAdapter.impl.Target;

/**
 * @author 方银剑
 * @Title: 类适配器
 * @ProjectName YfTest
 * @Description:
 *      在上图中可以看出，Adaptee类并没有sampleOperation2()方法，而客户端则期待这个方法。为使客户端能够使用Adaptee类，提供一个中间环节，即类Adapter，把Adaptee的API与Target类的API衔接起来。Adapter与Adaptee是继承关系，这决定了这个适配器模式是类的：
 * 　　模式所涉及的角色有：
 * 　　●　　目标(Target)角色：这就是所期待得到的接口。注意：由于这里讨论的是类适配器模式，因此目标不可以是类。
 * 　　●　　源(Adapee)角色：现在需要适配的接口。
 * 　　●　　适配器(Adaper)角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。显然，这一角色不可以是接口，而必须是具体类。
 * @date 2019/9/3
 */
public class Adapter extends Adaptee implements Target {

    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    @Override
    public void sampleOperation2() {
        //写相关的代码
        System.out.println("适配器");
    }


}
