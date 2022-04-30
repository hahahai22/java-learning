package 类的继承和多态.继承.test01;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/29 23:49
 *
 */
public class Test {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();

        // 子类继承父类的属性
        System.out.println("子类继承父类属性:" + childClass.parentName);
        // 子类覆盖（重写override）父类的属性
        System.out.println("子类中定义和父类中名称相同的name属性：" + childClass.name);

        // 子类继承父类的方法
        System.out.println("子类继承父类的方法：" + childClass.parentMethod());
    }
}
