import dao.ComplexDao;
import dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean("userDao4",UserDao.class);
        ComplexDao complexDao = context.getBean("complexDao",ComplexDao.class);
        System.out.println(complexDao);
        System.out.println(userDao);
    }

}
