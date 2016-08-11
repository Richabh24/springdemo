package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
      //  ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
       // ctx.start();
        Database d =ctx.getBean("mysql",Database.class);
        System.out.println("name --->" + d.getName() + " port-->" + d.getPort());
       d.connect();
        // d.getInteger();
       // d.throwException();
       // d.checkdata("richa");
       // d.getIntdata(200);
      //  Dummy dummy = ctx.getBean("dummy", Dummy.class);
      //  dummy.display();
      //  ctx.stop();
     /*   Dummytest dummytest=ctx.getBean("dummyTest",Dummytest.class);
System.out.print(dummytest);
        PersonalisedService personalisedService=ctx.getBean("personalisedService",PersonalisedService.class);
        System.out.println(personalisedService);
        System.out.println(personalisedService.employee.getCity());
*/

    }
}
