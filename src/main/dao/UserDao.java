package dao;

public class UserDao {
    private String name;

    private String address;

    private int id;
    private AccountDao accountDao;

    public AccountDao createAccountDao(){return new AccountDao();}

    public UserDao(String name, String address, int id, AccountDao accountDao) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.accountDao = accountDao;
    }

    public UserDao(String name, String address, int id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';

    }
    public UserDao(String name) {
        this.name = name;
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    public UserDao() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
