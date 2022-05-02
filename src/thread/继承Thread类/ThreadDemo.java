package thread.继承Thread类;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/1 11:44
 * 通过继承Thread类，创建线程对象
 */
public class ThreadDemo extends Thread {
    private Thread t;   // 这里t的值没有赋值，默认为null
    private String threadName;

    // 构造方法
    public ThreadDemo(String name) {
        threadName = name;
        System.out.println("创建的线程名称：" + threadName);
        System.out.println("t的值：" + t);
    }


    // 重写Thread类中的run()方法
    public void run() {
        System.out.println("运行线程" + threadName);

        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("线程名称为：" + threadName + "," + i);
                System.out.println("线程休息，时间为：1000ms");
                Thread.sleep(1000); // 中断异常
            }
        } catch (InterruptedException e) {
            System.out.println("线程" + threadName + "中断。。。");
        }
        System.out.println("线程" + threadName + "退出，终止。。。");
    }


    public void start() {
        System.out.println("启动线程 " + threadName);
        // 避免NPE（Null Point Exception空指针异常）
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
            return;
        }
        this.start();   // 这里的this代表子类（即：ThreadDemo类，ThreadDemo类继承了Thread类）
        // 意思是：ThreadDemo类调用他的成员方法start()
    }
}
