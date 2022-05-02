package thread.实现Runnable接口;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/2 13:14
 * 通过实现Runnable接口，创建线程
 */
public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    // 构造方法（用来创建RunnableDemo对象）
    RunnableDemo(String name) {    // 没有加访问权限修饰符，默认是包访问权限。
        threadName = name;
        System.out.println("创建线程，名称为：" + threadName);
    }


    // 重写run方法
    @Override
    public void run() {
        System.out.println("运行线程：" + threadName);

        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("线程名称为：" + threadName + "," + i);
                System.out.println("线程休息，时间为：100ms");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("线程" + threadName + "中断...");
        }
        System.out.println("线程：" + threadName + "结束，终止。。。");
    }


    public void start() {
        System.out.println("启动线程：" + threadName);

        if (t == null) {  // 防止NPE异常，即空指针异常
            // 将创建的Runnable对象作为Thread类的target参数创建Thread对象（实际的线程对象）
            t = new Thread(this, threadName);
            t.start();
            return;
        }
        this.start();   // 递归调用（ 在start()方法中调用start()自己 ）
    }
}
