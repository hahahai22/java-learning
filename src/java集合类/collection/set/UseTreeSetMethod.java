package java集合类.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/27 10:23
 */
public class UseTreeSetMethod {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person(33, "李一"));
        personTreeSet.add(new Person(22, "张二"));
        personTreeSet.add(new Person(27, "王三"));

        Iterator<Person> iterator1 = personTreeSet.iterator();
        while (iterator1.hasNext()) {
            Person person = iterator1.next();
            System.out.println("姓名：" + person.name + "；年龄：" + person.age);
        }
    }


}


// Person类定义
class Person implements Comparable<Person> {

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    int age;
    String name;
    @Override
    public int compareTo(Person person) { // 比较当前对象和传入对象的先后顺序
        int num = this.age - person.age;
        return num;
    }
}
/*
1
2
3
姓名：张二；年龄：22
姓名：王三；年龄：27
姓名：李一；年龄：33
 */
