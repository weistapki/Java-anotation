package annotation.basic;

public class Example {
    @CustomAnnotation("This is a custom annotation")
    public void testMethod(){
        System.out.println("Method executed");
    }
}
