package cn.xiaoyes.summerstudy.thread;

/**
 * 线程同步机制
 * (多个线程操作同一个资源)
 *
 * 并发：同一个对象被多个线程同时操作
 *
 * 现实生活中，我们会遇到“同一个资源，多个人都想使用”的问题，比如，食堂排队打翻，每个人都想吃饭，最天然的解决办法就是排队，一个一个来
 *
 * 处理多线程问题的时，多个线程访问同一个对象，并且某些线程还想修改这个对象，这时候我们就需要用线程同步，线程同步其实就是一种等待机制，
 * 多个需要同时访问此对象的线程进入这对象的等待池形成队列，等待前面线程使用完毕，下一个线程在使用。
 *
 * 由于同一个进程的多个线程共享同一块储存控件，在带来方便的同时，也带来了访问的冲突问题，为了保证数据在方法中被访问时的正确性
 * 在访问时需要加入锁机制synchronized放一个线程获得对象的排它锁，独占资源，其他线程必须等待，使用后释放锁即可存在一下问题：
 *  一个线程持有锁会导致其他所有需要此锁的线程挂起
 *  在多线程竞争下，加锁，释放锁会导致比较多的上下文切换和调度延时，引起性能问题
 *  如果一个优先级较高的线程等待一个优先级较低的线程释放锁，会导致优先级倒置，引起性能问题
 */
public class Demo16 {
    public static void main(String[] args) {

    }
}
