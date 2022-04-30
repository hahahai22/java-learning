package 类的继承和多态.多态.类型转换;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/30 18:58
 * 类型转化——向上类型转换
 * 子类和父类之间存在继承关系，因此对象类型之间存在转换（向上类型转换、向下类型转换）
 *
 * 类型转换——向下类型转换
 */
public class ChildClass extends ParentClass {
    public void print() {
        System.out.println("子类方法");
    }

    public void childMethod() {
        System.out.println("只在子类中定义的方法");
    }

    public static void main(String[] args) {
        /**
         * 向上类型转换
         * 子类对象引用转换成父类对象引用
         */
        ParentClass child = new ChildClass();

        /**
         * 这是因为子类中重写了父类中的print()方法，因此输出子类中定义的方法的内容。
         */
        child.print();  // 输出：子类方法


        /**
         * 编译报错
         * 因为父类中没有这个方法，因此报错
         */
        // child.childMethod();


        /**
         * 向下类型转换
         * 需要强制类型转换
         */
        ChildClass childClass = (ChildClass) child; // 强制类型转换
        child.print();
        childClass.childMethod();
        /*
        子类方法
        子类方法
        只在子类中定义的方法
         */
    }
}
