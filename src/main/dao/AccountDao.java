package dao;

import org.springframework.stereotype.Service;

//@Service("petService")
public class AccountDao {
    private String account;

    public String getAccount() {
        return account;
    }

    public AccountDao() {
    }
    @Override
    public String toString() {
        return "AccountDao{" +
                "account='" + account + '\'' +
                '}';
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
