
package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.PreparedStatement;

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
        jdbcTemplate.update(
                con -> {
                    PreparedStatement ps = con.prepareStatement(insertSQL);
                    ps.setString(1,"lili");
                    ps.setString(2,"mimi");
                    return ps;
                }
        );
    }


}
