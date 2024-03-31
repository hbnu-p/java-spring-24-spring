import annotation.AppConfig;
import annotation.UserDao;
import annotation.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AoontationTest {
    public static void main(String[] args) {
        // 注解配置容器
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // xml
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");

        UserService userService = context.getBean("userService",UserService.class);


        System.out.println(userService.getUserDao().getName());
    }
}
