package test;

import com.spring.demo.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by ttnd on 2/4/16.
 */
@Configuration
public class JavaConfig {
    @Scope("prototype")
    @Bean
    public Database mysqlDatabase(){
        Database mysql = new Database();
        mysql.setName("mysql");
        mysql.setPort(2);
        return  mysql;

    }
    @Scope("prototype")
    @Bean
    public Database oracleDatabase(){
        Database oracle = new Database();
        oracle.setName("oracle");
        oracle.setPort(22222);
        return  oracle;

    }
}
