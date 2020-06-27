import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanTwo = (Cat) applicationContext.getBean("cat");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanTwo1 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.equals(bean1));
        System.out.println(beanTwo.equals(beanTwo1));
    }
}