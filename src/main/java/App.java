import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat catBean = applicationContext.getBean("cat", Cat.class);

        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat catBean2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(bean == bean2);
        System.out.println(catBean == catBean2);
    }
}