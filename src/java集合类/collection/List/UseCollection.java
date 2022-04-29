package java集合类.collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/26 16:23
 */
public class UseCollection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("第一个集合元素");
        collection.add("第二个集合元素");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
