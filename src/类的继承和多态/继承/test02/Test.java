package 类的继承和多态.继承.test02;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/29 23:49
 *
 */
public class Test {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();

        // 子类重写父类的方法
        System.out.println("子类重写父类的方法：" + childClass.parentMethod());
        // 调用子类中的方法
        childClass.callParentMethod();
    }
}
