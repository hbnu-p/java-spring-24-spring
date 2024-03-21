package service;

import dao.AccountDao;
import dao.ItemDao;

public class PetService {
    private AccountDao accountDao;
    private ItemDao itemDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    @Override
    public String toString() {
        return "PetService{" +
                "accountDao=" + accountDao +
                ", itemDao=" + itemDao +
                '}';
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public ItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }
}
