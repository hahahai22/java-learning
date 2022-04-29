package java集合类.collection.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/26 17:43
 */
public class ArrayListGetSet {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add(0, "A");
        arrayList.add(1, "B");
        arrayList.set(1, "C");

        System.out.println("集合中的第一个元素值为：" + arrayList.get(0));
        System.out.println("集合中的第二个元素值为：" + arrayList.get(1));

        /*
        集合中的第一个元素值为：A
        集合中的第二个元素值为：C

        Process finished with exit code 0
         */

    }
}
