package 类的继承和多态.继承.test02;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/29 23:44
 * 子类中定义了和父类中相同的属性名，子类中的属性覆盖父类中的属性——override
 */
public class ChildClass extends ParentClass {

    // 子类重写的父类的方法
    public String parentMethod () {
        return "子类重写父类的方法";
    }

    // 子类调用父类被子类重写的父类的方法
    public void callParentMethod() {
        System.out.println("调用父类中被重写的方法：" + super.parentMethod());
    }
}
