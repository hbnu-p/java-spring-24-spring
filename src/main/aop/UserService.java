package aop;

import org.springframework.stereotype.Component;


@Component
public class UserService {

    public void addUser(){
        System.out.println("添加用户（被增强方法）。。。");
    }
}
