package test;

import com.spring.demo.Database;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ttnd on 2/4/16.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        Database mysql =ctx.getBean("mysqlDatabase", Database.class);
        Database oracle =ctx.getBean("oracleDatabase", Database.class);

        System.out.println(mysql);
        System.out.println(oracle);

    }
}
