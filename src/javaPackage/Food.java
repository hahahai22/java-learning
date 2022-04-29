package javaPackage;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/29 15:36
 */
public class Food {
    /**
     * 成员变量 即全局变量（直接在类中声明的属性） 可以在类中的每个地方调用
     * 局部变量 在方法中声明的属性 只能在所在方法中调用
     */
    // 成员变量 Food类各处可调用 所有类可以使用（不是包访问权限，是公开访问权限）
    public static String name;
    // 成员变量 Food类各处可调用 不能被其他方法调用(private私有访问权限)
    private static String size;

    // 私有方法，仅在Food类中可以调用
    private void eat() {
        System.out.println("eat");
    }

    public static void main(String[] args) {
        String variable = "局部变量";
        System.out.println("局部变量：" + variable);
        System.out.println("成员变量（全局变量）：" + size);
        /*
        局部变量：局部变量
        成员变量（全局变量）：null

        Process finished with exit code 0
         */
    }



}
