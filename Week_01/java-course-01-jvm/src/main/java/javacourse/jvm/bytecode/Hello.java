package javacourse.jvm.bytecode;

/**
 * @program: java-course
 * @description: 字节码测试类
 * @author: wangbo67@github.com
 * @created: 2021-01-22 09:12
 **/
public class Hello {
    private final static int a = 18;

    public static void printInfo(int b) {
        int c = 1;
        int realAge = b + c;
        String[] loveFood = {"apple", "banana"};
        if(a > realAge) {
            User user = new User("ziyu", realAge);
            for (String food : loveFood) {
                System.out.println(user.getName() + "最爱的食物是：" + food);
            }
        }
    }

    public static void main(String[] args) {
        printInfo(2);
    }
}