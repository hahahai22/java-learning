package interfacetest.test01;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/29 18:04
 */
public class AnimalServiceImpl implements AnimalService {
    @Override
    public void sleep() {
        System.out.println("实现动物接口");
    }

}
