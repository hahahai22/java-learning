package stringBuilderStringBuffer;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/29 11:12
 * StringBuilder提供了四个构造方法，创建StringBuilder对象
 *
 */
public class CreateStringBuilder {
    public static void main(String[] args) {
        // 创建StringBuilder对象
        StringBuilder stringBuilder01 = new StringBuilder(); // 空的
        StringBuilder stringBuilder02 = new StringBuilder(20); // 容量20的
        StringBuilder stringBuilder03 = new StringBuilder("学习");    // 初始值的
        StringBuilder stringBuilder04 = new StringBuilder(stringBuilder03); // 创建包含入参字符串的对象
        System.out.println(stringBuilder04);


    }

}
