package stringBuilderStringBuffer;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/29 14:58
 */
public class UseStringBuilder {
    public static void main(String[] args) {
        /**
         * append()
         */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("添加StringBuilder对象值：" + new StringBuilder("快乐学习"));
        System.out.println(stringBuilder);

        /**
         * insert()
         */
        StringBuilder stringBuilder02 = new StringBuilder("123456");
        stringBuilder02.insert(1, "大头"); // 索引1处添加字符串
        System.out.println(stringBuilder02);
        stringBuilder02.insert(3, "00000000");
        System.out.println(stringBuilder02);

        /**
         * delete()
         */
        StringBuilder stringBuilder03 = new StringBuilder("0123456");
        stringBuilder03.delete(3, 5);
        System.out.println(stringBuilder03);

    }
}
