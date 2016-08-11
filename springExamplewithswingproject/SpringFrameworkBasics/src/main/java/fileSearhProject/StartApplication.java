package fileSearhProject;

import com.spring.demo.Dummytest;
import com.spring.demo.PersonalisedService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApplication {
    public static void main(String[] args) {
      //  ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("fileconfig.xml");
        MyFile myFile=ctx.getBean("myFile",MyFile.class);
      //  FileSearchEngine myFile=ctx.getBean("fileSearchEngine",FileSearchEngine.class);

        System.out.print(myFile);
        myFile.main("richabhadani2438888");

    }
}
