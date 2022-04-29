package java集合类.collection.List;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/26 20:16
 * 静态常量 静态变量 静态代码块 静态方法
 * static final
 */
public class StaticComponent {

    /**
     * 静态代码块
     */
    static {
        System.out.println("静态代码块");
    }

    /**
     * 非静态代码块
     */
    {
        System.out.println("非静态代码块");
    }

    /**
     * 静态常量
     */
    public static final int EARTH_RADIUS = 6371;

    /**
     * 静态变量
     */
    static String name01 = "这是静态变量01";
    static String name02 = "这是静态变量02";
    public String name03 = "实例化的成员属性";


    /**
     * 静态方法
     */
    public void nonStaticMethod () {
        System.out.println("实例化成员方法");
    }

    public static void printName03() {
        System.out.println("这是静态方法");
        // 这里不能调用非静态方法
    }



    public static void main(String[] args) {
        /**
         * 静态常量的访问
         */
        System.out.println("地球半径为：" + EARTH_RADIUS);
        // 定义为非私有的常量，可以使用： 类名.常量名 访问。
        System.out.println(StaticComponent.EARTH_RADIUS);

        /**
         * 静态变量的访问
         */
        System.out.println("成员方法 调用:" + name01);
        System.out.println("通过 类型.变量 调用:" + StaticComponent.name01);   // 定义为非私有的静态变量，可以使用 类名.变量名 调用
        StaticComponent staticComponent = new StaticComponent();
        System.out.println("通过 实例化 调用:" + staticComponent.name01);

        StaticComponent a1 = new StaticComponent();
        StaticComponent a2 = new StaticComponent();
        System.out.println("静态变量原值：" + a1.name02);
        a1.name02 = "静态变量值变更";
        System.out.println("a1:" + a1.name02);  // a1:静态变量值变更
        System.out.println("a2:" + a2.name02);  // a2:静态变量值变更

        /**
         * 静态方法的访问
         */
        StaticComponent a3 = new StaticComponent();
        a3.printName03();   // 通过实例化访问
        // 通过 类.方法名 访问
        StaticComponent.printName03();  // ⚠️静态方法访问的时候可能没有实例化对象，因此静态方法中不允许使用this关键字


    }


}
