package 类的继承和多态.继承.test04;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/30 12:23
 * this关键字的使用
 * 用来获取子类中定义的成员变量和成员方法（当子类和父类中有相同名称的属性时，可以用this和super调用用以区分）
 */
public class ChildClass extends ParentClass {
    public String name = "子类成员属性";

    public void method() {
        System.out.println("子类成员方法");
    }

    public void printMethod() {
        String name = "方法内定义的变量";
        /**
         * this关键字用以区分，成员变量和方法中定义的变量（变量名相同时）
         * this关键字用来获取子类中定义的成员变量和成员方法
         */
        System.out.println(name);
        System.out.println(this.name); // 调用子类的成员属性name
        System.out.println(super.name); // 调用父类的成员属性name
        this.method(); // 调用子类的成员方法method
        super.method(); // 调用父类的成员方法method
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.printMethod();
        /*
        子类成员属性
        父类成员属性
        子类成员方法
        父类成员方法
         */
    }

}
