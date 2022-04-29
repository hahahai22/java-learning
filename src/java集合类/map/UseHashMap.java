package java集合类.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/27 11:38
 * 使用HashMap
 */
public class UseHashMap {
    /*
    Map<String, String> simpleMap = new HashMap<>();
    Map<String, Map<String, String>> complexMap = new HashMap<>();
    Map<Map<String, String>, String> otherComplexMap = new HashMap<>();
     */


    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("小明", "22岁");
        hashMap.put("小花", "11岁");
        hashMap.put("小刘", "24岁");

        /**
         * 使用key集合遍历hashMap
         */
        for (String key :
                hashMap.keySet()) {
            System.out.println("String key:" + key + " and value:" + hashMap.get(key));
        }

        /**
         * 使用Map.Entry的迭代器进行遍历
         */
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
        }

        /**
         * 使用Map.entrySet()来遍历
         */
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
        }

        /**
         * 使用Map.value()遍历所有值
         */
        for (String v : hashMap.values()) {
            System.out.println("value = " + v);
        }
    }
}
/*
String key:小刘 and value:24岁
String key:小明 and value:22岁
String key:小花 and value:11岁
key = 小刘 and value = 24岁
key = 小明 and value = 22岁
key = 小花 and value = 11岁
key = 小刘 and value = 24岁
key = 小明 and value = 22岁
key = 小花 and value = 11岁
value = 24岁
value = 22岁
value = 11岁

Process finished with exit code 0
 */
