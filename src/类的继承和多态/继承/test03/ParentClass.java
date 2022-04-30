package 类的继承和多态.继承.test03;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/30 11:35
 */
public class ParentClass {
    // 父类的非私有成员变量
    public String name;

    // 父类的构造方法
    ParentClass(String name) {
        this.name = name;   // 使用this关键字调用当前类中的成员变量name，即 this.name。
        // 这一句的意思是：将传入的参数name赋值给当前类中的成员变量name（this.name）。
        System.out.println("父类的无参构造：" + name);
    }

}
