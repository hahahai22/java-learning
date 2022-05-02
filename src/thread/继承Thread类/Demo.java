package thread.继承Thread类;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/1 12:18
 */
public class Demo {
    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo("线程-1");
        thread1.start();
        ThreadDemo thread2 = new ThreadDemo("线程-2");
        thread2.start();
    }
}
