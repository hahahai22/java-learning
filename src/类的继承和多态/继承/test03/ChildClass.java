package 类的继承和多态.继承.test03;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/30 11:35
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
