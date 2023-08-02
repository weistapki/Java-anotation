package annotation.basic;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Example example = new Example();
        Method method = example.getClass().getMethod("testMethod");
        CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
        if (annotation !=null){
            System.out.println(annotation.value());
        }
    }
}
