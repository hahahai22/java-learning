package 类的继承和多态.继承.test03;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/30 11:35
 * 子类不能继承父类的构造方法（父类的构造方法，只属于父类），
 * 但是可以使用super关键字访问父类的构造方法，并为父类的属性赋值，
 * super语句必须是代码块的第一条执行语句
 *
 */
public class ChildClass extends ParentClass{

    ChildClass (String name) {
        super(name);
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass("传入的名称");
    }
}
