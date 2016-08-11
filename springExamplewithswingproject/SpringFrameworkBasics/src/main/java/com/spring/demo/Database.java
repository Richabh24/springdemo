package com.spring.demo;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by ttnd on 2/4/16.
 */
public class Database {
        //implements ApplicationEventPublisherAware {
    private String name;
    private Integer port;


    public  void setName(String name)
    {

        this.name =name;
    }
    public  void setPort(Integer port)
    {

        this.port =port;
    }

    public String getName() {
        return name;
    }

    public Integer getPort() {
        return port;
    }

 /*   public Database(String name, Integer port) {
        this.name = name;
        this.port = port;
    }

    public Database() {

    }*/

    public void connect(){

System.out.println("Database Connection ......");
    }


    public Integer getInteger()
    {
        return  100;
    }
    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }


   /* ApplicationEventPublisher applicationEventPublisher;
    void connect() {
        CustomEvent customEvent = new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("connect");
    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }*/
    public void throwException(){
        System.out.print("throwException--------->");

        int i =1/0;
    }
    public String checkdata(String name){
        System.out.println("checkdata--------->"+name);

       return  name ; }
    public Integer getIntdata(Integer val){
        System.out.println("getIntdata--------->"+name);

        return  val ; }
}
