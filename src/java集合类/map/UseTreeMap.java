package java集合类.map;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/27 14:39
 *
 */
public class UseTreeMap {
    public static void main(String[] args) {
        TreeMap<Person, String> treeMap = new TreeMap<>();
        treeMap.put(new Person("张一", 2), "上大学");
        treeMap.put(new Person("王六", 12), "上小学");
        treeMap.put(new Person("孙三", 10), "初中");

        Iterator<Person> iterator = treeMap.keySet().iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person.toString());
        }
    }
}


class Person implements Comparable<Person> {

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    int age;
    String name;

    @Override
    public int compareTo(Person person) {
        int num = this.age - person.age;
        return num;
    }

    @Override
    public String toString() {
        return "name: " + this.name + " age:" + this.age;
    }
}
/*
name: 张一 age:2
name: 孙三 age:10
name: 王六 age:12

Process finished with exit code 0
 */
