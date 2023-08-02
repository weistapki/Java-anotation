package annotation.benckmark;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        FibExample example = new FibExample();
        Method method = example.getClass().getMethod("iterativeFib", long.class);
        if (method.isAnnotationPresent(Benckmark.class)){
            long statTime = System.currentTimeMillis();
            method.invoke(example,2000000000l);//Execute the method
            long entTime = System.currentTimeMillis();
            long duration = (entTime -statTime);
            System.out.println("Execution time: " + duration + " mil");
        }
    }
}
