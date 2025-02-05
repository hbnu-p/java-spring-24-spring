package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    private String name;

    public String getName() {
        return name;
    }

    public UserDao(String name) {
        this.name = name;
    }

    public UserDao() {
    }
    public void setName(String name) {
        this.name = name;
    }

}
