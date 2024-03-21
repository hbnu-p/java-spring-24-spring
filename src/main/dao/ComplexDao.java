package dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComplexDao {
    private List<String> list;
    private Set<Integer> set;
    private Map<Integer,String> map;

    public List<String> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "ComplexDao{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }
}
