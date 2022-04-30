package 类的继承和多态.多态.overload;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/30 18:44
 * 重载的演示
 */
public class OverloadSample {

    public void printName() {
        System.out.println("0入参方法");
    }

    public void printName(String name) {
        System.out.println("1入参方法" + name);
    }

    public void printName(int i) {
        System.out.println("不同类型入参" + i);
    }

    public void printName(String name, int i) {
        System.out.println("不同入参个数" + name + i);
    }

    public static void main (String[] args) {
        OverloadSample overloadSample = new OverloadSample();
        // 没有入参的调用
        overloadSample.printName();
        // 一个入参的调用
        overloadSample.printName("这是一个字符串");
        // 不同入参的调用
        overloadSample.printName(99);
        // 多个入参的调用
        overloadSample.printName("这是一个字符串", 88);
    }
}
