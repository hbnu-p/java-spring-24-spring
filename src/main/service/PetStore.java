package service;

import dao.AccountDao;
import dao.ItemDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.PetService;

public class PetStore {
    public static void main(String[] args) {
        // 获取容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"
        );

        // 获取bean

        AccountDao accountDao = (AccountDao) ctx.getBean("accountDao");
        ItemDao itemDao = ctx.getBean("itemDao",ItemDao.class);
        PetService petService = ctx.getBean("petService",PetService.class);

        // 调用对象
        System.out.println(petService);

    }
}
