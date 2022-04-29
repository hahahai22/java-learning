package java集合类.collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/26 17:51
 * ArrayList和LinkedList性能对比
 * LinkedList底层采用双向链表数据结构，因此向LinkedList集合中间插入，移除元素效率较高。但是随机访问，查寻集合中元素时，效率较低。
 * 链表的特点：随机访问，查询集合中元素效率较低。
 */
public class ArrayListAndLinkedList {
    static final int N = 10000;  // 常量

    static long countTime(List list) {
        long start = System.currentTimeMillis();
        Object o = new Object();
        for (int i = 0; i < N; i++) {
            list.add(i, o);
        }
        return System.currentTimeMillis() - start;
    }

    static long readList(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0, j = list.size(); i < j; i++) {
            list.get(i);
        }
        return System.currentTimeMillis() - start;
    }

    static List addToList (List list) {
        Object o = new Object();
        for (int i = 0; i < N; i++) {
            list.add(i, o);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("ArrayList添加" + N + "个元素，耗时：" + countTime(new ArrayList()));
        System.out.println("LinkedList添加" + N + "个元素，耗时：" + countTime(new LinkedList()));

        List listA = addToList(new ArrayList());
        List listB = addToList(new LinkedList());

        System.out.println("ArrayList获取/查找" + N + "个元素，耗时：" + readList(listA));
        System.out.println("LinkedList获取/查找" + N + "个元素，耗时：" + readList(listB));
    }
}
/*
ArrayList添加10000个元素，耗时：4
LinkedList添加10000个元素，耗时：5
ArrayList获取/查找10000个元素，耗时：1
LinkedList获取/查找10000个元素，耗时：66
 */
