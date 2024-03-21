package factory;

import dao.UserDao;

public class UserInstanceFactory {

    public UserDao createInstance(){return new UserDao();}
}
