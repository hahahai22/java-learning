package interfacetest.test01;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/29 18:05
 */
public class Test {

    public static void main(String[] args) {
        AnimalService animalService = new AnimalServiceImpl();
        animalService.sleep();
    }
}
