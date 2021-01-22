package javacourse.jvm.classloader;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: java-course-01-jvm
 * @description: 自定义类加载器
 * @author: wangbo67@github.com
 * @created: 2021-01-22 15:24
 **/
public class HelloClassLoader extends ClassLoader {
    public static void main(String[] args) {
        try {
            Class clazz = new HelloClassLoader().findClass("Hello");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                method.invoke(clazz.newInstance());
            }
//            Method method = clazz.getDeclaredMethod("hello");
//            method.invoke(clazz.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            File file = new File("/Users/wangbo/Develop/projects/java-course/java-course-01-jvm/src/main/resources/META_INF/" + name + ".xlass");
            InputStream inputStream = new FileInputStream(file);
            byte[] byteArr = inputStreamToByte(inputStream);
            for (int i = 0; i < byteArr.length; i++) {
                //byteArr[i] = (byte) (255 - byteArr[i]);
                // 按位取反
                byteArr[i] = (byte) ~byteArr[i];
            }
            return defineClass(name, byteArr, 0, byteArr.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException(name);
    }

    private byte[] inputStreamToByte(InputStream is) {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int ch;
        try {
            while (-1 != (ch = is.read(buffer))) {
                byteStream.write(buffer, 0, ch);
            }
            byte data[] = byteStream.toByteArray();
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                byteStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}