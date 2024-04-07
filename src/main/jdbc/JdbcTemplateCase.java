
package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;

// JDBC
public class JdbcTemplateCase {
    public static void main(String[] args) {
        // create data source
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // set up connection configure
        dataSource.setUrl("jdbc:sqlite:C:/Users/mightnire/IdeaProjects/java-spring-24-spring/data.db");
        dataSource.setDriverClassName("org.sqlite.JDBC");
        // create jdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        // Create SQL String
        String createTable = "CREATE TABLE IF NOT EXISTS wp_user(name varchar(20),address varchar(40))";
        // execute
        jdbcTemplate.execute(createTable);

        // insert
        String insertSQL = "INSERT INTO wp_user(name,address) values(?,?)";
        jdbcTemplate.update(insertSQL,"zhangsan","china");

        // modify
        String updateSQL = "UPDATE wp_user SET address = ? WHERE name = ?";
        jdbcTemplate.update(updateSQL,"hubei","zhangsan");

        // delete
        String deleteSQL = "DELETE FROM wp_user WHERE name = ?";
        jdbcTemplate.update(deleteSQL,"zhangsan");

        // lambda
//        jdbcTemplate.update(
//                con -> {
//                    PreparedStatement ps = con.prepareStatement(insertSQL);
//                    ps.setString(1,"lili");
//                    ps.setString(2,"mimi");
//                    return ps;
//                }
//        );

        // query
//
        String selectsql0 = "select address from wp_user where name = ?";
        String res1 = jdbcTemplate.queryForObject(selectsql0,String.class,"lili");
        System.out.println(res1);

        String selectsql1 = "select address from wp_user";
        List<String> addressList = jdbcTemplate.queryForList(selectsql1,String.class);
        for (String s : addressList) {
            System.out.println(s);
        }

        String selectall = "select * from wp_user";
        List<Map<String,Object>> result = jdbcTemplate.queryForList(selectall);
        for (Map<String,Object> map: result){
            for(String s: map.keySet()){
                System.out.println(s + "->" + map.get(s));
            }
        }


        String selectsql2 = "select * from wp_user where name = ?";
        Person p = jdbcTemplate.queryForObject(selectsql2,(rs,rsNum) -> {
            Person person = new Person();
            person.setAddress(rs.getString("address"));
            person.setName(rs.getString("name"));
            return person;
        },"lili");
        System.out.println(p.toString());
    }


}
