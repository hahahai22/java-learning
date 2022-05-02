package thread.实现Runnable接口;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/5/2 13:40
 */
public class Demo {
    public static void main(String[] args) {
        RunnableDemo thread1 = new RunnableDemo("线程-1");
        thread1.start();
        RunnableDemo thread2 = new RunnableDemo("线程-2");
        thread2.start();
    }
}
