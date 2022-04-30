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
        this.name = name;
        System.out.println("父类的无参构造：" + name);
    }

}
