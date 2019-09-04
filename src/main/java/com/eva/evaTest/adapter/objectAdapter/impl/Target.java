package com.eva.evaTest.adapter.objectAdapter.impl;

/**
 * @author 方银剑
 * @Title: Target
 * @ProjectName YfTest
 * @Description: TODO
 * @date 2019/9/320:29
 */
public interface Target {

    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1();
    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2();
}
