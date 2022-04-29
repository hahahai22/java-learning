package java集合类.collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/26 17:21
 */
public class UseArrayList {
    public static void main(String[] args) {
        /**
         * 第一个<String>声明了都是String类型的list集合元素。即：元素都是String类型的。
         * 第二个<>可以不用填写，new创建一个新的集合对象的时候，可以省略<>，系统编译时，自动填充。
         * 第三个指定数组对象的初始容量为10个元素。
         */
        /*
        java集合类.collection.List<String> list = new ArrayList<String>();
        // ArrayList<E> list1 = new ArrayList<>();
        java集合类.collection.List<String> list2 = new ArrayList<>(10);
        */


        List<String> list = new ArrayList<String>();
        list.add("第一个元素");
        list.add("第二个元素");
        list.add("第三个元素");

        list.remove(1);

        //for each遍历集合元素
        for (String element : list) {
            System.out.println("foreach遍历集合元素：" + element);
        }

        // 迭代器遍历集合元素
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("迭代遍历：" + iterator.next());
        }

    }
}
