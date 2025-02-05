package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

//    @Autowired
    @Qualifier("userDao1")
    private UserDao userDao;

    public UserService(){
    }

    @Bean(name = "userDao1")
    @Primary
    public UserDao newInstance(){
        return new UserDao("zhou kangan");
    }
}
