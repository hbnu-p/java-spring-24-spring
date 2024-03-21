package factory;

import dao.UserDao;

public class UserStaticService {
    private static UserDao userDao = new UserDao();

    public static UserDao createInstance(){return userDao;}
}
