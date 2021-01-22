package javacourse.jvm.bytecode;

/**
 * @program: java-course
 * @description: User 测试类
 * @author: wangbo67@github.com
 * @created: 2021-01-22 09:13
 **/
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}