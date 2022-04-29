package stringBuilderStringBuffer;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/29 11:46
 */
public class UseStringBuffer {
    public static void main(String[] args) {
        /*
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer(22);
        StringBuffer stringBuffer3 = new StringBuffer("你好呀");
        StringBuffer stringBuffer4 = new StringBuffer(stringBuffer3);
         */
        StringBuffer stringBuffer = new StringBuffer("github地址");
        stringBuffer.append("https://github.com");

        System.out.println("stringBuffer的容量：" + stringBuffer.capacity());
        System.out.println("stringBuffer的长度：" + stringBuffer.length());
        stringBuffer.replace(0, 5, "替换");
        System.out.println("stringBuffer替换后的内容：" + stringBuffer);
        stringBuffer.insert(6,"工程师");
        System.out.println(stringBuffer);



    }

}
