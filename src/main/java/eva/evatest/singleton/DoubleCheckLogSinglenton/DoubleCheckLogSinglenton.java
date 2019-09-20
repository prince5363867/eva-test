package eva.evatest.singleton.DoubleCheckLogSinglenton;

/**
 * @author 方银剑
 * @Title: DoubleCheckLogSinglenton
 * @ProjectName eva-test
 * @Description: 双重检查加锁
 * 　可以使用“双重检查加锁”的方式来实现，就可以既实现线程安全，又能够使性能不受很大的影响。那么什么是“双重检查加锁”机制呢？
 *
 * 　　所谓“双重检查加锁”机制，指的是：并不是每次进入getInstance方法都需要同步，而是先不同步，进入方法后，先检查实例是否存在，如果不存在才进行下面的同步块，这是第一重检查，进入同步块过后，再次检查实例是否存在，如果不存在，就在同步的情况下创建一个实例，这是第二重检查。这样一来，就只需要同步一次了，从而减少了多次在同步情况下进行判断所浪费的时间。
 *
 * 　　“双重检查加锁”机制的实现会使用关键字volatile，它的意思是：被volatile修饰的变量的值，将不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
 *
 * 　　注意：在java1.4及以前版本中，很多JVM对于volatile关键字的实现的问题，会导致“双重检查加锁”的失败，因此“双重检查加锁”机制只只能用在java5及以上的版本。
 *
 * 这种实现方式既可以实现线程安全地创建实例，而又不会对性能造成太大的影响。它只是第一次创建实例的时候同步，以后就不需要同步了，从而加快了运行速度。
 *
 * 　　提示：由于volatile关键字可能会屏蔽掉虚拟机中一些必要的代码优化，所以运行效率并不是很高。因此一般建议，没有特别的需要，不要使用。也就是说，虽然可以使用“双重检查加锁”机制来实现线程安全的单例，但并不建议大量采用，可以根据情况来选用。
 *
 * 　　根据上面的分析，常见的两种单例实现方式都存在小小的缺陷，那么有没有一种方案，既能实现延迟加载，又能实现线程安全呢？
 *
 *
 * @date 2019/9/20
 */
public class DoubleCheckLogSinglenton {
    private static volatile DoubleCheckLogSinglenton instance = null;

    public DoubleCheckLogSinglenton() {
    }

    public static DoubleCheckLogSinglenton getInstance(){
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(instance == null){
            //同步块，线程安全的创建实例
            synchronized (DoubleCheckLogSinglenton.class){
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new DoubleCheckLogSinglenton();
                }
            }
        }
        return instance;
    }

}
