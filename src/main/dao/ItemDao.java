package dao;

public class ItemDao {
    private String item;

    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "ItemDao{" +
                "item='" + item + '\'' +
                '}';
    }

    public void setItem(String item) {
        this.item = item;
    }
}
