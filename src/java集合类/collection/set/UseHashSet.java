package java集合类.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/27 09:43
 * HashSet
 */
public class UseHashSet<E> {
    /*
    Set<String> hashSet = new HashSet<String>();  // 声明了元素都是String类型的Set集合
    Set<E> hashSet2 = new HashSet<>();  // E 是Java中合法的数据类型，代表它可以是Java中任意合法的数据类型。
    Set<E> hashSetWithCapacity = new HashSet<>(10); // 初始化指定大小的Set集合
     */
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("B");  // 只会保留一个B元素
        hashSet.add("D");
        hashSet.remove("D");
        System.out.println("集合大小：" + hashSet.size());

        // foreach遍历HashSet对象
        for (String element :
                hashSet) {
            System.out.println("hashSet中的元素：" + element);
        }

        // 迭代器遍历HashSet对象
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("迭代器遍历集合元素：" + iterator.next());
        }
    }
}
/**
 * 集合大小：3
 * hashSet中的元素：A
 * hashSet中的元素：B
 * hashSet中的元素：C
 * 迭代器遍历集合元素：A
 * 迭代器遍历集合元素：B
 * 迭代器遍历集合元素：C
 */
